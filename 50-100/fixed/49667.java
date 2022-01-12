private void run() {
    while (true) {
        if (quit) {
            break;
        }
        ui.update();
        if (victory) {
            ui.victory();
            break;
        }
        char command = inputScanner.readChar();
        executeGameCommand(command);
    } 
}