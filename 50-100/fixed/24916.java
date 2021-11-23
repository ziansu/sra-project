public static void setScene(java.lang.String path, java.lang.Object... data) {
    try {
        javafx.fxml.FXMLLoader loader = new javafx.fxml.FXMLLoader(core.KioskMain.class.getClassLoader().getResource(path));
        javafx.scene.Scene scene = new javafx.scene.Scene(loader.load());
        loader.<controllers.IControllerWithParams>getController().initData(data);
        core.KioskMain.stage.setScene(scene);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}