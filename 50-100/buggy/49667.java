private void run() {
    while (true) {
        ui.update();
        if (victory) {
            ui.victory();
            break;
        }
        if (quit) {
            break;
        }
        char command = inputScanner.readChar();
        executeGameCommand(command);
    } 
}