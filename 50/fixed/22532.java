@java.lang.Override
public void initialize(java.net.URL location, java.util.ResourceBundle resources) {
    this.screenController = new controller.ScreenController(playfieldLayer);
    new controller.LevelController(this);
}