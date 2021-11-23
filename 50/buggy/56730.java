public void register(java.io.File file) {
    filesToWatch.add(file);
    timeStamps.put(file, file.lastModified());
}