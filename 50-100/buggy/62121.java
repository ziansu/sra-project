public void handlerOnProducts(int idUser, ru.teamrocket.csrsysteamdesktop.Model.User user) {
    try {
        javafx.fxml.FXMLLoader loader = new javafx.fxml.FXMLLoader();
        loader.setLocation(getClass().getResource("/template/Products.fxml"));
        javafx.scene.Parent parent = loader.load();
        borderPane.setCenter(parent);
        ru.teamrocket.csrsysteamdesktop.Controller.DetailsUsersController detailsUsersController = loader.getController();
        detailsUsersController.setRootController(this);
        detailsUsersController.setUserForUpdate(idUser, user);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}