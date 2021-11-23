public void saveOutput(javafx.scene.Scene scene, dpfmanager.shell.modules.classes.Configuration config) {
    javafx.scene.control.CheckBox chkDefaultOutput = ((javafx.scene.control.CheckBox) (scene.lookup("#chkDefaultOutput")));
    javafx.scene.control.TextField txtOutput = ((javafx.scene.control.TextField) (scene.lookup("#txtOutput")));
    if (!(chkDefaultOutput.isSelected())) {
        config.setOutput(txtOutput.getText());
    }else {
        config.setOutput(null);
    }
}