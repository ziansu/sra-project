@javafx.fxml.FXML
void rechercheSelonCriteres(javafx.event.ActionEvent event) {
    java.lang.System.out.println(motOuDefinietionRechercher.getText());
    if (motOuDefinietionRechercher.getText().isEmpty()) {
        javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.WARNING);
        alert.setTitle("Avertissement");
        alert.setHeaderText("Erreur");
        alert.setContentText("Il n'y a aucun mot ou définition à recherche");
        alert.show();
    }else {
        recherche(false);
    }
}