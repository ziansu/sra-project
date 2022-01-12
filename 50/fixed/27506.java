public void destroy() {
    if ((temporaryFolder) != null) {
        temporaryFolder.delete();
        temporaryFolder = null;
    }
}