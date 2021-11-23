public static void attachUserIdToAccessToken(java.lang.String accessToken, java.lang.Long userId) {
    if (null == accessToken) {
        return ;
    }
    com.xinran.controller.util.MobileSessionHolder.map.put(accessToken, userId);
}