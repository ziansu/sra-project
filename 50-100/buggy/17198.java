private void logAvailableBytes(java.io.InputStream in, int style) {
    try {
        int available = in.available();
        int len;
        while (available > 0) {
            len = in.read(NinjaConsole.NinjaConsole.s_tempBytes);
            log(style, new java.lang.String(NinjaConsole.NinjaConsole.s_tempBytes, 0, len));
        } 
    } catch (java.io.IOException e) {
        java.lang.System.err.println(e);
    }
}