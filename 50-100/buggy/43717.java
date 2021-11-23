private void setCryptMenuItemsAccess() {
    if (((menuItemEncrypt) != null) && ((menuItemDecrypt) != null)) {
        menuItemEncrypt.setEnabled(currentDirectory.getEntry().getAbsolutePath().contains((((libraryRootPath) + "/") + (DECRYPTED_FOLDER_NAME))));
        menuItemDecrypt.setEnabled(currentDirectory.getEntry().getAbsolutePath().contains((((libraryRootPath) + "/") + (ENCRYPTED_FOLDER_NAME))));
    }
}