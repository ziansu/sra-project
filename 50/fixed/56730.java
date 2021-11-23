public void register(java.io.File file) {
    if (file != null) {
        filesToWatch.add(file);
        timeStamps.put(file, file.lastModified());
    }
}