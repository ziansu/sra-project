private void newAnonymousUser(com.argo.sdk.protobuf.PAppSession.Builder builder) {
    builder.setUserId(0);
    builder.setUserName(com.argo.sdk.core.AppSessionAbstractImpl.GUEST);
    builder.setUserKind(0);
    builder.setRealName(com.argo.sdk.core.AppSessionAbstractImpl.GUEST);
    builder.setProfileImageUrl("");
    wrapTestUser(builder);
    setSessionId();
    com.argo.sdk.core.AppSessionAbstractImpl.current = builder.build();
    save();
}