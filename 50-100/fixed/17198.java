private void logAvailableBytes(java.io.InputStream in, int style) {
    try {
        int available = in.available();
        int len;
        while (available > 0) {
            len = in.read(NinjaConsole.NinjaConsole.s_tempBytes);
            if (len > 0) {
                log(style, new java.lang.String(NinjaConsole.NinjaConsole.s_tempBytes, 0, len));
            }
            available = in.available();
        } 
    } catch (java.io.IOException e) {
        java.lang.System.err.println(e);
    }
}