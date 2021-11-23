@javafx.fxml.FXML
public void btnHomeOnClick(javafx.event.ActionEvent event) {
    homeActive();
    javafx.fxml.FXMLLoader fxmlLoader = new javafx.fxml.FXMLLoader();
    try {
        fxmlLoader.load(getClass().getResource("/view/beranda.fxml").openStream());
    } catch (java.io.IOException e) {
    }
    javafx.scene.layout.AnchorPane root = fxmlLoader.getRoot();
    acContent.getChildren().clear();
    acContent.getChildren().add(root);
    java.lang.System.out.println(lblUsrName.getText());
    java.lang.System.out.println(lblUserId.getText());
}