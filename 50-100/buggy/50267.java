@javafx.fxml.FXML
public void initialize() {
    if ((this.menu) == null) {
        this.menu = new KabasujiModel.GameMenu();
    }
    if ((KabasujiControllers.StartScreenController.menu.getLevelNumber()) > (KabasujiControllers.StartScreenController.menu.getUnlocked())) {
        lockIcon.setVisible(true);
    }else {
        lockIcon.setVisible(false);
    }
    levelNumberLabel.setText(java.lang.Integer.toString(KabasujiControllers.StartScreenController.menu.getLevelNumber()));
}