private void createFile(java.lang.String fileName) {
    java.io.File file = new java.io.File((((settingsPath) + (java.io.File.separator)) + fileName));
    if ((file != null) && (!(file.exists()))) {
        try {
            if (!(file.createNewFile())) {
                throw new java.io.IOException();
            }
        } catch (java.lang.Exception e) {
        }
    }
}