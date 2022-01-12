public boolean isLocalFolder(java.lang.String name) throws com.fsck.k9.mail.MessagingException {
    if (name == null)
        return false;
    
    com.fsck.k9.mailstore.LocalStore store = getLocalStore();
    if (store == null)
        return false;
    
    java.util.List<? extends com.fsck.k9.mail.Folder> folders = store.getPersonalNamespaces(true);
    for (com.fsck.k9.mail.Folder f : folders) {
        if ((f.getName().equals(name)) && (f.getSyncClass().equals(FolderClass.LOCAL)))
            return true;
        
    }
    return false;
}