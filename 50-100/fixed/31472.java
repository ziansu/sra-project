@javafx.fxml.FXML
private void clickFacture(javafx.scene.input.MouseEvent event) {
    if (!(tbv_facture.getSelectionModel().isEmpty())) {
        f = tbv_facture.getSelectionModel().getSelectedItem();
        listVente.clear();
        listVente.addAll(f.getVenteFacture());
    }
}