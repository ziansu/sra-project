public void PlayTurnHuman() {
    int input;
    do {
        input = mainInterface.getPlayerChoice();
        if (!(validatePlayerInput(input))) {
            mainInterface.printWrongInput();
        }
    } while (!(validatePlayerInput(input)) );
    makeMove(input);
}