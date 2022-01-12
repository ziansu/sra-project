public void close() throws java.lang.Exception {
    if ((pcc) != null) {
        try {
            pcc.close();
            pcc = null;
        } catch (java.io.IOException ignored) {
        }
    }
    if ((ccf) != null) {
        try {
            ccf.close();
        } catch (java.lang.Exception ignored) {
        }
    }
}