public static void loadFXML(java.lang.String path) {
    javafx.scene.Parent root = null;
    try {
        root = javafx.fxml.FXMLLoader.load(com.emeraldElves.alcohollabelproject.Main.class.getResource(path));
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    com.emeraldElves.alcohollabelproject.Main.stage.getScene().setRoot(root);
}