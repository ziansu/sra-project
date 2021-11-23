private java.lang.Integer clearActiveDirectory(com.dropbox.core.v2.DbxClientV2 client, java.lang.String path) {
    try {
        java.util.List<com.dropbox.core.v2.files.Metadata> result = client.files().listFolder(path).getEntries();
        for (com.dropbox.core.v2.files.Metadata entry : result)
            client.files().delete(entry.getPathDisplay());
        
    } catch (com.dropbox.core.DbxException e) {
        e.printStackTrace();
        return 0;
    }
    return 1;
}