private void handleConsoleKeyEvent(javafx.scene.input.KeyEvent event) {
    switch ((event.getCode()) + "") {
        case "ENTER" :
            slave.getConsole().read(textInputConsole.getText());
            break;
        case "UP" :
            slave.getConsole().CallPrevious();
            break;
        default :
            break;
    }
}