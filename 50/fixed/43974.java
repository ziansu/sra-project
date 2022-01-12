private java.lang.String path(java.io.File file) {
    return file.getAbsolutePath().replace(((repo.getRepository().getDirectory().getParentFile().getAbsolutePath()) + "/"), "");
}