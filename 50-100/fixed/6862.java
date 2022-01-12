public void gameCycle(java.awt.Color color) {
    if (color == (chosenColor)) {
        gui.ColorGameGUI.finalScore = (gui.ColorGameGUI.finalScore) + 100;
        setWord();
        setColor();
        count = (count) + 1;
    }else {
        setWord();
        setColor();
        count = (count) + 1;
    }
    if ((count) == 5) {
        endGame();
    }
}