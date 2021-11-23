public boolean checkAnswer(int answer) {
    java.lang.System.out.println(("answer: " + answer));
    if (answer == (currAnswer)) {
        hintArea.setText("");
        if ((game.getRemainingHints()) == 0)
            game.finish();
        
        playGame();
        return true;
    }
    return false;
}