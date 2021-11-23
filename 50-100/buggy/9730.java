public boolean checkAnswer(int answer) {
    java.lang.System.out.println(("answer: " + answer));
    java.lang.System.out.println(("Current answer: " + (currAnswer)));
    if (answer == (currAnswer)) {
        java.lang.System.out.println(("answer: " + answer));
        hintArea.setText("");
        if ((game.getRemainingHints()) == 0)
            game.finish();
        
        playGame();
        return true;
    }
    return false;
}