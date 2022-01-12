public void run() {
    try {
        com.javaOOPProject.server.XMLManager.parceToXMLString(registratedUsers, PATH_TO_DATA);
    } catch (javax.xml.bind.JAXBException ex) {
        ex.printStackTrace();
        errorLabel.setText(ServerGUIMessages.ERROR_SAVING_CHANGES.getMessage());
        errorLabel.setVisible(true);
    } catch (java.io.FileNotFoundException ex) {
        errorLabel.setText(ServerGUIMessages.CANNOT_FIND_FILE_TO_SAVE.getMessage());
        errorLabel.setVisible(true);
        ex.printStackTrace();
    }
}