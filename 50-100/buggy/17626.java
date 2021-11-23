@java.lang.Override
public java.util.List<java.lang.String> getMonitoringFiles() {
    files.clear();
    java.io.File directory = new java.io.File(getMonitoringDir());
    java.io.File[] fList = directory.listFiles();
    for (java.io.File file : fList) {
        if (file.isFile()) {
            files.add(file.getName());
        }
    }
    return files;
}