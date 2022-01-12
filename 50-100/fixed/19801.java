@javafx.fxml.FXML
private void handleMenuOpen(javafx.event.ActionEvent event) {
    javafx.stage.FileChooser fileChooser = new javafx.stage.FileChooser();
    fileChooser.setTitle("Datei öffnen");
    java.io.File file = fileChooser.showOpenDialog(((javafx.stage.Stage) (tableListen.getScene().getWindow())));
    if (file != null) {
        net.cgro.votemanager.model.Wahl wahl = javax.xml.bind.JAXB.unmarshal(file, net.cgro.votemanager.model.Wahl.class);
        net.cgro.votemanager.model.Wahl.setInstance(wahl);
    }
    initializeGUI();
}