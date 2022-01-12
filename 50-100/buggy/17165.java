public static <T> T getDefault(int dbIndex, java.lang.String key, java.lang.Class<T> clazz, T defaultValue) {
    java.lang.String str = com.puyixiaowo.medis.utils.RedisUtils.getJedis(dbIndex).get(key);
    if (com.puyixiaowo.medis.utils.StringUtils.isBlank(str)) {
        return defaultValue;
    }
    return com.alibaba.fastjson.JSONObject.parseObject(str, clazz);
}