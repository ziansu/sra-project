public static void setScene(java.lang.String path, java.lang.Object... data) {
    try {
        javafx.fxml.FXMLLoader loader = new javafx.fxml.FXMLLoader(core.KioskMain.class.getClassLoader().getResource(path));
        controllers.IControllerWithParams controller = loader.<controllers.IControllerWithParams>getController();
        controller.initData(data);
        loader.getController();
        javafx.scene.Scene scene = new javafx.scene.Scene(loader.load());
        core.KioskMain.stage.setScene(scene);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}