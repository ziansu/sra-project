public void openFolder(java.lang.String folderName) throws java.lang.Exception {
    folder = store.getFolder(folderName);
    if ((folder) == null) {
        throw new java.lang.Exception("Invalid folder");
    }
    try {
        folder.open(Folder.READ_WRITE);
    } catch (javax.mail.MessagingException ex) {
        folder.open(Folder.READ_ONLY);
    }
}