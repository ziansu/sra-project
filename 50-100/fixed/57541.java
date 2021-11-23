protected final void cleanupOutputStream() {
    if (out.checkError()) {
        out = null;
        throw new java.lang.RuntimeException("Error writing file");
    }
    out.flush();
    out.close();
    if (out.checkError()) {
        out = null;
        throw new java.lang.RuntimeException("Error writing file");
    }
}