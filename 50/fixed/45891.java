protected boolean checkTime(java.io.File file) {
    return this.checkTime(file.getName(), file.lastModified());
}