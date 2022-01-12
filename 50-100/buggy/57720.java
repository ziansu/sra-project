public static java.lang.Boolean isLastUsingDailySchedule(android.content.Context context) {
    java.lang.String settingFileName = context.getString(R.string.setting_file_name);
    final android.content.SharedPreferences preferences = context.getSharedPreferences(settingFileName, 0);
    java.lang.String lastUsingSchedule = preferences.getString(MainActivity.LAST_USING_SCHEDULE, "none");
    switch (lastUsingSchedule) {
        case com.example.myapplication.MainActivity.LAST_USING_DAILY_SCHEDULE_TAG :
            return true;
        case com.example.myapplication.MainActivity.LAST_USING_EXAM_SCHEDULE_TAG :
            return false;
        default :
            return null;
    }
}