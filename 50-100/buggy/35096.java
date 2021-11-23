public static final java.lang.String getCurrentDate() {
    long now = java.lang.System.currentTimeMillis();
    if ((now - (utils.FastHttpDateFormat.currentDateGenerated)) > 1000) {
        synchronized(utils.FastHttpDateFormat.format) {
            if ((now - (utils.FastHttpDateFormat.currentDateGenerated)) > 1000) {
                utils.FastHttpDateFormat.currentDateGenerated = now;
                utils.FastHttpDateFormat.currentDate = utils.FastHttpDateFormat.format.format(new java.util.Date(now));
            }
        }
    }
    return utils.FastHttpDateFormat.currentDate;
}