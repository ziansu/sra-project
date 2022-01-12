@javafx.fxml.FXML
private void addInfRow() {
    java.lang.String eth = "eth";
    java.lang.String infName = (eth + (java.lang.Integer.toString(index))) + ":";
    application.Graphics.addInfRow(infName, infRow);
    (index)++;
    infRow.getScene().getWindow().sizeToScene();
}