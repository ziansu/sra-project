private void writeToPageFile(java.io.InputStream inputStream) {
    try {
        java.io.OutputStream outputStream = new java.io.BufferedOutputStream(new java.io.FileOutputStream(getOrCreatePageFile(), true));
        int read;
        while ((read = inputStream.read()) != (-1))
            outputStream.write(read);
        
        outputStream.flush();
        outputStream.close();
    } catch (java.io.IOException e) {
        throw new java.lang.RuntimeException("paging error", e);
    }
}