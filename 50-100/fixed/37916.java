public void copyAllFilesTo(java.io.File dir) throws java.io.IOException {
    for (java.util.Map.Entry<java.lang.String, java.io.File> entry : files.entrySet()) {
        org.apache.commons.io.FileUtils.copyFile(entry.getValue(), new java.io.File((((dir.getAbsolutePath()) + (java.io.File.separator)) + (entry.getKey()))));
    }
    for (net.mindengine.galen.reports.model.FileTempStorage storage : childStorages) {
        storage.copyAllFilesTo(dir);
    }
}