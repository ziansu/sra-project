private void sendHandshake() {
    try {
        output.write(java.lang.String.format(org.appcelerator.kroll.runtime.v8.JSDebugger.HANDSHAKE_MESSAGE, this.sdkVersion).getBytes("UTF8"));
        output.flush();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}