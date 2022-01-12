public void run() {
    registratedUsers.getCurrentClient().setPermissionForCrypt(permissionCheckBoxAllUsers.isSelected());
    try {
        com.javaOOPProject.server.XMLManager.parceToXMLString(registratedUsers, PATH_TO_DATA);
    } catch (java.io.FileNotFoundException ex) {
        errorLabel.setText(ServerGUIMessages.CANNOT_FIND_FILE_TO_SAVE.getMessage());
        errorLabel.setVisible(true);
        ex.printStackTrace();
    } catch (java.io.IOException ex) {
        ex.printStackTrace();
        errorLabel.setText(ServerGUIMessages.ERROR_SAVING_CHANGES.getMessage());
        errorLabel.setVisible(true);
    }
}