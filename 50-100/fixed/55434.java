@javafx.fxml.FXML
public void btnHomeOnClick(javafx.event.ActionEvent event) throws java.io.IOException {
    homeActive();
    javafx.scene.layout.AnchorPane root = ((javafx.scene.layout.AnchorPane) (javafx.fxml.FXMLLoader.load(getClass().getResource("/view/beranda.fxml"))));
    acContent.getChildren().clear();
    acContent.getChildren().add(root);
    java.lang.System.out.println(lblUsrName.getText());
    java.lang.System.out.println(lblUserId.getText());
}