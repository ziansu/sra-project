public int countLocalFolders() throws com.fsck.k9.mail.MessagingException {
    int cnt = 0;
    com.fsck.k9.mailstore.LocalStore store = getLocalStore();
    java.util.List<? extends com.fsck.k9.mail.Folder> folders = store.getPersonalNamespaces(true);
    java.util.List<com.fsck.k9.mailstore.LocalFolder> localFolders = new java.util.ArrayList<com.fsck.k9.mailstore.LocalFolder>();
    for (com.fsck.k9.mail.Folder f : folders) {
        com.fsck.k9.mailstore.LocalFolder lf = ((com.fsck.k9.mailstore.LocalFolder) (f));
        if (lf == null)
            continue;
        
        if (lf.getSyncClass().equals(FolderClass.LOCAL))
            cnt++;
        
    }
    return cnt;
}