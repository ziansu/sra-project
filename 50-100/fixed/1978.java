public long delayDelayConfiguration(long date, java.util.List<java.lang.Float> influencingMasterDataQuality, java.lang.String node, java.lang.String key) {
    int delay = getIntRangeConfigurationValue(influencingMasterDataQuality, node, key, false);
    java.util.Calendar calendar = java.util.Calendar.getInstance();
    calendar.setTimeInMillis(date);
    calendar.add(java.util.Calendar.DATE, delay);
    return calendar.getTimeInMillis();
}