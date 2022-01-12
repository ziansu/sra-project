public void close() throws java.lang.Exception {
    if ((pcc.get()) != null) {
        try {
            pcc.get().close();
            pcc.remove();
        } catch (java.io.IOException ignored) {
        }
    }
    if ((ccf) != null) {
        try {
            ccf.get().close();
            ccf.remove();
        } catch (java.lang.Exception ignored) {
        }
    }
}