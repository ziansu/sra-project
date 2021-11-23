public float getDrivingDistance(com.example.desent.desent.utils.TimeScale timeScale) {
    float distance = 0;
    android.content.SharedPreferences pref = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
    if (pref.getBoolean("pref_key_car_owner", false)) {
        switch (timeScale) {
            case TODAY :
                distance = db.getDrivingDistanceToday();
                break;
            case WEEK :
                distance = db.getWeekAverageDrivingDistance();
                break;
            case MONTH :
                distance = db.getMonthAverageDrivingDistance();
                break;
        }
    }else {
        distance = 0.0F;
    }
    return distance;
}