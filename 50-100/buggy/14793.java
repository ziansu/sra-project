public boolean isLocalFolder(java.lang.String name) throws com.fsck.k9.mail.MessagingException {
    com.fsck.k9.mailstore.LocalStore store = getLocalStore();
    java.util.List<? extends com.fsck.k9.mail.Folder> folders = store.getPersonalNamespaces(true);
    for (com.fsck.k9.mail.Folder f : folders) {
        if ((f.getName().equals(name)) && (f.getSyncClass().equals(FolderClass.LOCAL)))
            return true;
        
    }
    return false;
}