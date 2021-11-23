private final int checkMetadata(com.digitalpebble.storm.crawler.Metadata metadata) {
    if ((customIntervals) == null)
        return defaultfetchInterval;
    
    for (java.lang.String[] customMd : customIntervals) {
        java.lang.String[] values = metadata.getValues(customMd[0]);
        for (java.lang.String v : values) {
            if (v.equals(customMd[1])) {
                return java.lang.Integer.parseInt(customMd[2]);
            }
        }
    }
    return defaultfetchInterval;
}