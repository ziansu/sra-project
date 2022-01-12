@java.lang.Override
public void initialize(java.net.URL arg0, java.util.ResourceBundle arg1) {
    canvas.getChildren().add(selectedArea);
    umlElement.selectedToggleProperty().addListener(( obs, oldToggle, newToggle) -> {
        try {
            javafx.scene.control.Toggle selectType = umlElement.getSelectedToggle();
            javafx.scene.control.ToggleButton btn = ((javafx.scene.control.ToggleButton) (selectType));
            type = operation.get(btn.getText());
        } catch (java.lang.NullPointerException event) {
            type = null;
        }
    });
}