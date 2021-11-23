private android.javax.sdp.SessionDescription createSdp(java.lang.String localAddress, long sessionId, long sessionVersion, java.lang.String sessionName) throws android.javax.sdp.SdpException {
    android.javax.sdp.SessionDescription sdp = android.javax.sdp.SdpFactory.getInstance().createSessionDescription(localAddress);
    android.gov.nist.gnjvx.sdp.fields.OriginField originField = createOriginField(sdp, sessionId, sessionVersion);
    sdp.setOrigin(originField);
    android.gov.nist.gnjvx.sdp.fields.SessionNameField sessionNameField = createSessionNameField(sessionName);
    sdp.setSessionName(sessionNameField);
    return sdp;
}