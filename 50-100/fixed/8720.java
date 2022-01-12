private void openFolder(java.lang.String folderName) throws javax.mail.MessagingException {
    folder = store.getFolder(folderName);
    if ((folder) == null) {
        throw new javax.mail.MessagingException("Invalid folder");
    }
    try {
        folder.open(Folder.READ_WRITE);
    } catch (javax.mail.MessagingException ex) {
        folder.open(Folder.READ_ONLY);
    }
}