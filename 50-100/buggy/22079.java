public com.flashphoner.sdk.softphone.ISoftphoneCall call(final java.lang.String caller, final java.lang.String callee, final java.lang.String visibleName, final java.lang.Boolean isVideoCall, java.util.Map<java.lang.String, java.lang.String> inviteParameters) throws com.flashphoner.sdk.softphone.exception.LicenseRestictionException, com.flashphoner.sdk.softphone.exception.SoftphoneException {
    Logger.logger.info(4, ("RtmpClient.call() " + callee));
    com.flashphoner.sdk.softphone.ISoftphoneCall call = getSoftphone().call(caller, callee, visibleName, isVideoCall, inviteParameters);
    streamStart(login, call.getId());
    return call;
}