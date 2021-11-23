public void updateCompress() {
    for (int v = 768; v <= 771; v++) {
        org.zaproxy.zap.extension.httpsInfo.SSLServer.ServerHello sh = org.zaproxy.zap.extension.httpsInfo.SSLServer.connect(isa, v, org.zaproxy.zap.extension.httpsInfo.SSLServer.CIPHER_SUITES.keySet());
        if ((sh != null) && ((sh.compression) == 1)) {
            defcomp = true;
        }else {
            defcomp = false;
        }
    }
}