@javafx.fxml.FXML
private void onProductSelected(javafx.event.ActionEvent event) {
    if ((products.getValue()) != null) {
        nettoPrice.setText(java.lang.Float.toString(products.getValue().getPrice()));
    }
}