public void write(java.nio.ByteBuffer ip) {
    try {
        android.util.Log.d(trikita.capture.VPNThread.TAG, trikita.capture.IPUtils.hexdump("INCOMING IP PACKET:", ip));
        mVpnOut.write(ip);
        if (ip.hasRemaining()) {
            trikita.capture.IPUtils.panic("incomplete write to VPN fd");
        }
    } catch (java.io.IOException e) {
        trikita.capture.IPUtils.panic(("exception in write to VPN fd" + (e.getMessage())));
    }
}