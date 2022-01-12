@java.lang.Override
public void start(javafx.stage.Stage stage) throws java.lang.Exception {
    this.stage = stage;
    if (!(logic.isConfigured())) {
        new itinerary.userinterface.FileNameRequestDialog(listener).start(stage);
    }else {
        openMainApplication(this.stage);
    }
}