@javafx.fxml.FXML
protected void saveProjectAsAction(javafx.event.ActionEvent event) {
    boolean success = true;
    java.lang.String detailMsg = null;
    try {
        if (!(getModel().saveProjectAs())) {
            return ;
        }
    } catch (java.lang.Exception ex) {
        success = false;
        detailMsg = ex.getMessage();
    }
    showSaveFileAlert(success, detailMsg);
}