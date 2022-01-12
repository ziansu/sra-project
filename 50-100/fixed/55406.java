private boolean isTakenYesterday(android.content.SharedPreferences sharedPreferences) {
    java.util.Calendar yesterday = java.util.Calendar.getInstance();
    yesterday.add(java.util.Calendar.DATE, (-1));
    java.lang.String lastTakenDay = sharedPreferences.getString(SharedPreferenceConstants.LAST_TAKEN_DAY, SharedPreferenceConstants.DEFAULT_LAST_TAKEN_DAY);
    if (!(DateFormatConstants.DATE_FORMAT.format(yesterday.getTime()).equals(lastTakenDay))) {
        if (!(new de.ivleafcloverapps.pillreminder.utils.BreakUtil(sharedPreferences).isBreak(yesterday, true))) {
            return false;
        }
    }
    return true;
}