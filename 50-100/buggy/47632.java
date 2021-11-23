public java.lang.String getAccessTokenAndSaveToNosql() throws cn.com.sunjiesh.xcutils.common.base.ServiceException {
    java.lang.String nosqlProvider = cn.com.sunjiesh.wechat.common.ConfigProperties.getProperty(ConfigProperties.NOSQL_PROVIDER);
    if (!(org.apache.commons.lang3.StringUtils.isEmpty(nosqlProvider))) {
        if (nosqlProvider.equals("redis")) {
            return getAccessTokenAndSaveToRedis();
        }
    }
    return getAccessTokenAndSaveToRedis();
}