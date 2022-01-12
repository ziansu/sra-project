private static java.lang.Boolean rePush(java.util.Date lastPushAt) {
    try {
        java.util.Calendar cal = java.util.Calendar.getInstance();
        java.util.Date currentDate = new java.util.Date();
        cal.setTime(lastPushAt);
        cal.add(java.util.Calendar.HOUR, java.lang.Integer.valueOf(Config.RePushTaskToTwitter));
        java.util.Date convertedDate = cal.getTime();
        return currentDate.before(convertedDate);
    } catch (java.lang.Exception e) {
        sociam.pybossa.TaskPerformer.logger.error(("Error " + e));
        return false;
    }
}