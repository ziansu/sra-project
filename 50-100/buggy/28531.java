private void appendResourceToFile(java.lang.String resourcePath, java.io.File traceFile) {
    try (java.io.OutputStream out = new java.io.FileOutputStream(traceFile, true);java.io.InputStream in = getClass().getResourceAsStream(resourcePath)) {
        byte[] buffer = new byte[1024];
        int len;
        while ((len = in.read(buffer)) != (-1)) {
            out.write(buffer, 0, len);
        } 
    } catch (java.io.IOException e) {
        throw org.gradle.internal.UncheckedException.throwAsUncheckedException(e);
    }
}