private void desactivarBotones(javafx.scene.control.Button... buttons) {
    for (int j = 0; j < (buttons.length); j++) {
        buttons[j].setDisable(true);
    }
}