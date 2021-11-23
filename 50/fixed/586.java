public static boolean hasAccessToAddOrUpdateUserAuthorData(com.pratilipi.data.client.UserAuthorData userAuthorData) {
    return userAuthorData.getUserId().equals(com.pratilipi.filter.AccessTokenFilter.getAccessToken().getUserId());
}