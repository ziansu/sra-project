public static java.lang.String formatDateForCurrent(java.lang.String source) {
    if (source.contains(com.emc.storageos.services.util.TimeUtils.DATE_TIME_PATTERN)) {
        java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat(com.emc.storageos.services.util.TimeUtils.DATE_TIME_FORMAT);
        java.util.Date current = com.emc.storageos.services.util.TimeUtils.getCurrentDate();
        java.lang.String formattedDate = dateFormat.format(current);
        return source.replace(com.emc.storageos.services.util.TimeUtils.DATE_TIME_PATTERN, formattedDate);
    }else {
        return source;
    }
}