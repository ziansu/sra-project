public void writeToFile(org.eclipse.core.resources.IFile file) throws org.eclipse.core.runtime.CoreException {
    java.io.InputStream source = new java.io.ByteArrayInputStream(writeToString().getBytes(java.nio.charset.Charset.availableCharsets().get("UTF-8")));
    if (file.exists()) {
        file.setContents(source, false, true, null);
    }else {
        file.create(source, true, null);
    }
}