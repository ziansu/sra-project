public static boolean hasAccessToListBatchProcess() {
    com.pratilipi.data.type.AccessToken accessToken = com.pratilipi.filter.AccessTokenFilter.getAccessToken();
    return com.pratilipi.common.util.UserAccessUtil.hasUserAccess(accessToken.getUserId(), AccessType.BATCH_PROCESS_LIST);
}