@javafx.fxml.FXML
public void chooseProjectDirectory() {
    tfPathOfProject.setText(at.htl.common.fx.FxUtils.chooseDirectory("Select Project Directory", null).getPath());
}