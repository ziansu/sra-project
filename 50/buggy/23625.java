void setAlarmForNextNamaz(android.content.Context context) {
    java.lang.System.out.println("I am getting called, again and again");
    final int ONE_SECOND = 1000;
    final int ONE_MINUTE = ONE_SECOND * 60;
    final int TEN_MINUTES = ONE_MINUTE * 10;
    mHelpers = new com.byteshaft.namaztime.Helpers(context);
    settingAlarm(context, TEN_MINUTES);
}