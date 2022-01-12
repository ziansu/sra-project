public static void loadFXML(java.lang.String path) {
    javafx.fxml.FXMLLoader root = null;
    try {
        root = new javafx.fxml.FXMLLoader(com.emeraldElves.alcohollabelproject.Main.class.getResource(path));
        com.emeraldElves.alcohollabelproject.Main.stage.getScene().setRoot(((javafx.scene.Parent) (root.load())));
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}