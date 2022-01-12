private void callParser() {
    try {
        parser = new de.fh_bielefeld.geograph.PARSER.OSMParser(content);
        try {
            content = parser.parse();
            clearCanvas();
            draw();
        } catch (java.lang.NullPointerException | de.fh_bielefeld.geograph.API.Exception.InvalidAPIRequestException e) {
            e.printStackTrace();
        }
    } catch (java.lang.NullPointerException e) {
        javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.INFORMATION);
        alert.setTitle("Kritischer Fehler");
        alert.setHeaderText(null);
        alert.setContentText("Bitte Programm neustarten");
        alert.showAndWait();
    }
}