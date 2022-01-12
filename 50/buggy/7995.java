@javafx.fxml.FXML
private void btnDeny_Click(javafx.event.ActionEvent event) {
    if ((selectedIncident) != null) {
        instance.deleteIncident(selectedIncident);
        database.DatabaseManager.denyIncident(selectedIncident.getType(), selectedIncident.getLocation());
    }
}