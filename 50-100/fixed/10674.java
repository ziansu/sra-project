protected void addRequestTime(long requestTime, java.util.Map<java.lang.String, java.lang.Object> map) {
    if ((this.includeRequestTime) && (requestTime > 0)) {
        final long sec = java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(requestTime);
        final long ms = java.util.concurrent.TimeUnit.MILLISECONDS.toMillis((requestTime - (java.util.concurrent.TimeUnit.SECONDS.toMillis(sec))));
        java.lang.String time = java.lang.String.format("%01d.%03d", sec, ms);
        if (time != null) {
            map.put(ch.qos.logback.contrib.json.access.JsonLayout.REQUESTTIME_ATTR_NAME, time);
        }
    }
}