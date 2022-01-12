@javafx.fxml.FXML
private void sceneListener(javafx.scene.input.KeyEvent e) {
    e.consume();
    javafx.scene.input.KeyCode code = e.getCode();
    if (code == (javafx.scene.input.KeyCode.TAB)) {
        if (!(inputBar.isFocused())) {
            inputBar.requestFocus();
        }
        if (_isDemo.get()) {
            if (e.isShiftDown()) {
                _demoController.prevPart();
            }else {
                _demoController.nextPart();
            }
        }
    }
}