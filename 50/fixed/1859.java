private java.lang.String getToday() {
    java.lang.String str = com.xgf.winecome.utils.TimeUtils.TimeStamp2Date(java.lang.String.valueOf(java.lang.System.currentTimeMillis()), TimeUtils.FORMAT_PATTERN_DATE);
    return str;
}