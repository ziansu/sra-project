public void enableSrtp(final org.mobicents.media.server.impl.srtp.DtlsHandler handler) {
    this.secure = true;
    this.dtlsHandler = handler;
}