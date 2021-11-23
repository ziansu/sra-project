public static java.lang.String getLeftTime() {
    if (null != (com.junyou.hbks.TimeManager.activity)) {
        java.lang.String leftTime = com.junyou.hbks.TimeManager.activity.getSharedPreferences("config", com.junyou.hbks.TimeManager.activity.MODE_PRIVATE).getString(com.junyou.hbks.TimeManager.TOTAL_TIME, "0");
        return leftTime;
    }
    return null;
}