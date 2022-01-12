public static com.pratilipi.data.type.AccessToken newUserAccessToken() {
    com.pratilipi.data.DataAccessor dataAccessor = com.pratilipi.data.DataAccessorFactory.getDataAccessor();
    com.pratilipi.data.type.AccessToken accessToken = dataAccessor.newAccessToken();
    accessToken.setUserId(0L);
    accessToken.setType(AccessTokenType.USER);
    accessToken.setExpiry(new java.util.Date(com.pratilipi.data.util.AccessTokenDataUtil.ONE_MONTH_MILLIS));
    accessToken.setCreationDate(new java.util.Date());
    accessToken = dataAccessor.createOrUpdateAccessToken(accessToken);
    return accessToken;
}