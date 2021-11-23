public void close() {
    try {
        w_logWriter.close();
    } catch (java.io.IOException excep_io) {
        excep_io.printStackTrace(java.lang.System.err);
    }
}