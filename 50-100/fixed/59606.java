public void processUserInput() throws bence.game2048.GameInterruptedException {
    switch (readFromConsole()) {
        case bence.game2048.Game2048.KEY_LEFT :
            left();
            break;
        case bence.game2048.Game2048.KEY_RIGHT :
            right();
            break;
        case bence.game2048.Game2048.KEY_UP :
            up();
            break;
        case bence.game2048.Game2048.KEY_DOWN :
            down();
            break;
    }
}