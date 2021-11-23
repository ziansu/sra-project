public java.lang.Boolean saveDataset(java.lang.String filename, java.util.ArrayList<com.distroguy.jContacts.Contact> contacts) {
    try {
        java.io.ObjectOutputStream outputStream = new java.io.ObjectOutputStream(new java.io.FileOutputStream(organiserFile.getAbsolutePath()));
        outputStream.writeObject(contacts);
        outputStream.flush();
        outputStream.close();
    } catch (java.lang.Exception e) {
        return false;
    }
    return true;
}