public java.io.InputStream openStream() {
    try {
        java.lang.Process process = startProcess();
        java.lang.System.out.println("start reading");
        java.io.BufferedInputStream in = new java.io.BufferedInputStream(process.getInputStream());
        return in;
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        throw new java.lang.RuntimeException(e);
    }
}