@javafx.fxml.FXML
void goToBoutiques(javafx.scene.input.MouseEvent event) throws java.io.IOException {
    javafx.fxml.FXMLLoader loader = new javafx.fxml.FXMLLoader(getClass().getResource("/fxml/magasin/admin/Admin_Map.fxml"));
    sp = loader.load();
    paneLayout.setContent(sp);
    switchButtonStyle(boutiques);
    paneLayout.setVvalue(0);
}