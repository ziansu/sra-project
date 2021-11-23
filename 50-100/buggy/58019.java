public static java.lang.String getValueByKey(java.lang.String InfoServer, java.lang.String key) {
    java.lang.String[] lines = com.ctrip.xpipe.utils.StringUtil.splitByLineRemoveEmpty(InfoServer);
    for (java.lang.String line : lines) {
        line = line.trim();
        if (line.startsWith(key, key.length())) {
            java.lang.String[] keyAndVal = com.ctrip.xpipe.utils.StringUtil.splitRemoveEmpty(com.ctrip.xpipe.redis.console.health.migration.RedisInfoServerUtils.COLON_SPLITTER, line);
            return keyAndVal[1];
        }
    }
    return null;
}