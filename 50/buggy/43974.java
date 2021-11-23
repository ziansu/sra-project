private java.lang.String path() {
    return file.getAbsolutePath().replace(((repo.getRepository().getDirectory().getParentFile().getAbsolutePath()) + "/"), "");
}