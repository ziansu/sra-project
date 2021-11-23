public static java.lang.Long getCurrentUserIdByAccessToken(java.lang.String accessToken) {
    return com.xinran.controller.util.MobileSessionHolder.map.get(accessToken);
}