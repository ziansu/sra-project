public static void checkWin() {
    if ((gamestuff.Game.n) >= 100) {
        gamestuff.Game.leftPrompt.setText("LOSE");
        gamestuff.Game.rightPrompt.setText("WIN");
        gamestuff.Game.label.setText("<- - - - - -OVER- - - - - ->");
        gamestuff.Game.n += 200;
    }else
        if ((gamestuff.Game.n) <= 0) {
            gamestuff.Game.rightPrompt.setText("LOSE");
            gamestuff.Game.leftPrompt.setText("WIN");
            gamestuff.Game.label.setText("<- - - - - -OVER- - - - - ->");
            gamestuff.Game.n = -100;
        }
    
}