public java.lang.String getValue(java.lang.String key) {
    java.lang.String fullPath = com.iquanwai.platon.biz.util.zk.ZKConfigUtils.CONFIG_PATH.concat(key);
    try {
        if ((zk.exists(fullPath, false)) != null) {
            return getValue(key, com.iquanwai.platon.biz.util.zk.ZKConfigUtils.CONFIG_PATH);
        }else {
            return getArchValue(key);
        }
    } catch (java.lang.Exception e) {
        logger.error(e.getLocalizedMessage(), e);
        return null;
    }
}