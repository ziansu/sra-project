private void createFile(java.lang.String fileName) {
    java.io.File file = new java.io.File((((settingsPath) + (java.io.File.separator)) + fileName));
    if ((file != null) && (!(file.exists()))) {
        try {
            file.createNewFile();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return ;
        }
    }
}