private boolean searchFor(java.lang.String path, java.lang.String user) throws com.dropbox.core.DbxException {
    java.util.List<com.dropbox.core.DbxEntry> result;
    result = ConnectionInit.client.searchFileAndFolderNames(path, user);
    for (com.dropbox.core.DbxEntry f : result) {
        return f.name.equals(user);
    }
    return false;
}