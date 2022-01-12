@javafx.fxml.FXML
public void chooseProjectDirectory() {
    java.io.File file = at.htl.common.fx.FxUtils.chooseDirectory("Select Project Directory", null);
    if (file != null)
        tfPathOfProject.setText(file.getPath());
    
}