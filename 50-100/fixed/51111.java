public void proceed(int size) {
    int toughness = 1;
    java.lang.Object[] options = new java.lang.Object[]{ "Easy" , "Moderate" , "Hard" };
    toughness = javax.swing.JOptionPane.showOptionDialog(null, "What's your difficulty level ?", "Difficulty", javax.swing.JOptionPane.YES_NO_CANCEL_OPTION, javax.swing.JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
    if (toughness == (-1))
        java.lang.System.exit(0);
    
    minesweeper.Minesweeper.newGame = new minesweeper.game(size, toughness);
    minesweeper.Minesweeper.newGame.main(minesweeper.Minesweeper.newGame, size);
}