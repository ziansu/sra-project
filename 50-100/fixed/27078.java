private de.edelweiss_schuetzen.meytonAnalysis.view.View loadFXML(java.net.URL url, java.lang.String title) throws java.io.IOException {
    javafx.fxml.FXMLLoader loader = new javafx.fxml.FXMLLoader();
    loader.setLocation(url);
    javafx.scene.Parent root = loader.load();
    de.edelweiss_schuetzen.meytonAnalysis.view.ViewController controller = ((de.edelweiss_schuetzen.meytonAnalysis.view.ViewController) (loader.getController()));
    controller.init(this);
    return new de.edelweiss_schuetzen.meytonAnalysis.view.View(controller, new javafx.scene.Scene(root), title);
}