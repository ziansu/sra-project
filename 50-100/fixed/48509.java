public void loadScreen(java.lang.String name, java.lang.String resource) {
    try {
        javafx.fxml.FXMLLoader loader = new javafx.fxml.FXMLLoader(getClass().getResource(resource));
        javafx.scene.Parent screen = loader.load();
        addScreen(name, screen);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}