public java.lang.String modify(java.io.File file) throws java.lang.Exception {
    if (!(file.isFile())) {
        return null;
    }
    java.lang.String id = synchronizer.update(file);
    uploadManifestToAllAccounts();
    return id;
}