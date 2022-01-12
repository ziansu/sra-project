public static boolean isNight() {
    int hour = java.util.Calendar.getInstance().get(java.util.Calendar.HOUR_OF_DAY);
    return (((hour > ((me.ccrama.redditslide.SettingValues.nightStart) + 12)) || (hour < (me.ccrama.redditslide.SettingValues.nightEnd))) && (me.ccrama.redditslide.SettingValues.tabletUI)) && (me.ccrama.redditslide.SettingValues.nightMode);
}