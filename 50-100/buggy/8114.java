private boolean needToCheck(android.content.Context context) {
    java.lang.String date = owo.npc.taipeitechrefined.utility.Utility.getDateString("yyyy-MM-dd", java.util.Calendar.getInstance().getTime());
    android.content.SharedPreferences settings = context.getSharedPreferences(MainApplication.SETTING_NAME, Context.MODE_PRIVATE);
    java.lang.String date_flag = settings.getString(owo.npc.taipeitechrefined.ActivityCheckReceiver.CHECK_FLAG, null);
    settings.edit().putString(owo.npc.taipeitechrefined.ActivityCheckReceiver.CHECK_FLAG, date).apply();
    return !(date.equals(date_flag));
}