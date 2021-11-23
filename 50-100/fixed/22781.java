public void start(javafx.stage.Stage PiStage) throws java.lang.Exception {
    javafx.fxml.FXMLLoader PiLoader = new javafx.fxml.FXMLLoader(getClass().getResource("PiView.fxml"));
    javafx.scene.layout.Region contentRootRegion = ((javafx.scene.layout.Region) (PiLoader.load()));
    PiRoot = org.gillius.jfxutils.JFXUtil.createScalePane(contentRootRegion, 960, 540, false);
    javafx.scene.Scene scene = new javafx.scene.Scene(PiRoot, PiRoot.getPrefWidth(), PiRoot.getPrefHeight());
    PiStage.setScene(scene);
    PiStage.setTitle("Charting Example");
    PiStage.show();
}