protected boolean checkTime(boolean check, java.io.File file) {
    return check ? this.checkTime(file.getName(), file.lastModified()) : true;
}