@javafx.fxml.FXML
private void activateAddUser() throws java.io.IOException {
    knjiznica.model.GlobalCollection.setUser(null);
    javafx.scene.layout.BorderPane addUser = ((javafx.scene.layout.BorderPane) (javafx.fxml.FXMLLoader.load(getClass().getResource("AddUser-view.fxml"))));
    ((javafx.scene.layout.BorderPane) (knjiznica.model.ViewProvider.getView("mainScreen"))).setCenter(addUser);
}