public static java.lang.Long getCurrentUserIdByAccessToken(java.lang.String accessToken) {
    if (null == accessToken) {
        return null;
    }
    return com.xinran.controller.util.MobileSessionHolder.map.get(accessToken);
}