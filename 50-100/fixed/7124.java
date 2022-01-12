public void write(java.nio.ByteBuffer ip) {
    try {
        mVpnOut.write(ip);
        if (ip.hasRemaining()) {
            trikita.capture.IPUtils.panic("incomplete write to VPN fd");
        }
    } catch (java.io.IOException e) {
        trikita.capture.IPUtils.panic(("exception in write to VPN fd" + (e.getMessage())));
    }
}