private void newAnonymousUser(com.argo.sdk.protobuf.PAppSession.Builder builder) {
    builder.setUserId(0);
    builder.setUserName(com.argo.sdk.core.AppSessionAbstractImpl.GUEST);
    builder.setUserKind(0);
    builder.setRealName(com.argo.sdk.core.AppSessionAbstractImpl.GUEST);
    builder.setProfileImageUrl("");
    builder.setSessionId((((java.lang.System.currentTimeMillis()) / 1000) + ""));
    wrapTestUser(builder);
    com.argo.sdk.core.AppSessionAbstractImpl.current = builder.build();
    save();
}