protected void cleanupOutputStream() {
    if (out.checkError()) {
        throw new java.lang.RuntimeException("Error writing file");
    }
    out.flush();
    out.close();
    if (out.checkError()) {
        throw new java.lang.RuntimeException("Error writing file");
    }
}