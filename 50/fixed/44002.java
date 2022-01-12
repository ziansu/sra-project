@javafx.fxml.FXML
public void handleBackPressed() {
    edu.gatech.scrumbags.fxapp.MainFXApplication.loadScene(Scenes.main);
    edu.gatech.scrumbags.fxapp.MainFXApplication.userInfo = null;
}