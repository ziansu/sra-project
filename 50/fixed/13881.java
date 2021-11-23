@java.lang.Override
protected void finalize() throws java.lang.Throwable {
    try {
        cleanup();
    } finally {
        super.finalize();
    }
}