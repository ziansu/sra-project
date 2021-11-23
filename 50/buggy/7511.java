public java.lang.Boolean imageFileExists() {
    if ((paths.length) > 0) {
        java.io.File imageFile = new java.io.File(paths[0]);
        return imageFile.exists();
    }
    return false;
}