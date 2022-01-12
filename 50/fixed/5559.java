protected void finalize() throws java.lang.Throwable {
    try {
        close();
    } finally {
        super.finalize();
    }
}