public void show() {
    try {
        percorso_finale = ((CARTELLA_CONTROLLER) + (CONTROLLER)) + (ESTENSIONE_CONTROLLER);
        java.lang.System.out.println(percorso_finale);
        javafx.fxml.FXMLLoader fx = new javafx.fxml.FXMLLoader();
        fx.setLocation(presentation.StageController.class.getResource(percorso_finale));
        presentation.StageController.stage.setScene(new javafx.scene.Scene(((javafx.scene.Parent) (fx.load()))));
        presentation.StageController.stage.show();
    } catch (java.io.IOException e1) {
        e1.printStackTrace();
    }
}