private void appendResourceToFile(java.lang.String resourcePath, java.io.File traceFile, boolean append) {
    try (java.io.OutputStream out = new java.io.FileOutputStream(traceFile, append);java.io.InputStream in = getClass().getResourceAsStream(resourcePath)) {
        byte[] buffer = new byte[1024];
        int len;
        while ((len = in.read(buffer)) != (-1)) {
            out.write(buffer, 0, len);
        } 
    } catch (java.io.IOException e) {
        throw org.gradle.internal.UncheckedException.throwAsUncheckedException(e);
    }
}