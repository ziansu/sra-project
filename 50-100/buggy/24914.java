public static javafx.scene.Node setForeground(java.net.URL resource) {
    javafx.scene.Node previous = null;
    try {
        javafx.fxml.FXMLLoader myLoader = new javafx.fxml.FXMLLoader(resource);
        javafx.scene.Node node = myLoader.load();
        previous = edu.gatech.cs2340.trydent.TrydentEngine.getInstance().fxManager.setForeground(node);
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(e.getMessage());
    }
    return previous;
}