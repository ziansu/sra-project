@java.lang.Override
public boolean initWxWebContext() {
    java.lang.String qrcodeLink = prepareLogin();
    java.lang.String qrcode = com.lostjs.wx4j.utils.QrCodeUtil.genTerminalQrCode(qrcodeLink);
    LOG.info("Scan qrcode to login: \n{}", qrcode);
    java.util.Optional<java.lang.String> loginUrl = waitLogin();
    if (!(loginUrl.isPresent())) {
        throw new java.lang.RuntimeException("can't get login url");
    }
    return login(loginUrl.get());
}