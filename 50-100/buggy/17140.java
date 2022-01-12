@javafx.fxml.FXML
protected void saveProjectAsAction(javafx.event.ActionEvent event) {
    boolean success;
    java.lang.String detailMsg = null;
    try {
        success = getModel().saveProjectAs();
    } catch (java.lang.Exception ex) {
        success = false;
        detailMsg = ex.getMessage();
    }
    showSaveFileAlert(success, detailMsg);
}