public void gameCycle(java.awt.Color color) {
    if (color == (chosenColor)) {
        gui.ColorGameGUI.finalScore = (gui.ColorGameGUI.finalScore) + 100;
        setWord();
        setColor();
        gui.ColorGameGUI.count = (gui.ColorGameGUI.count) + 1;
    }else {
        setWord();
        setColor();
        gui.ColorGameGUI.count = (gui.ColorGameGUI.count) + 1;
    }
    if ((gui.ColorGameGUI.count) == 5) {
        endGame();
    }
}