private static java.lang.String getSignature(java.lang.String method) {
    return APIAccess.getMD5Hash(((((APIAccess.DEV_ID) + method) + (APIAccess.AUTH_KEY)) + (APIAccess.getUtcTimeStamp())));
}