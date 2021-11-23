private void engineMove() {
    switch (difficulty) {
        case "easy" :
            engine.sendCommand("go depth 1");
            break;
        case "medium" :
            engine.sendCommand("go depth 5");
            break;
        case "hard" :
            engine.sendCommand("go depth 10");
            break;
    }
    int[] results = engineOutputToMove();
    currentBoard.move(results[0], results[1], currentAllowedColor.toUpperCase().charAt(0), true);
}