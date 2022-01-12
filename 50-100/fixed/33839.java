private void roundComplete() {
    if ((getQuestion().getDifficulty()) == (Question.Difficulty.HARD)) {
        game.setDisplayPanel(game.SUBJECT_SCREEN);
        game.SUBJECT_SCREEN.init(true);
        game.SUBJECT_SCREEN.setDisabledSubject(getQuestion().getSubject());
    }else {
        game.setDisplayPanel(game.CONTINUE_SCREEN);
        game.CONTINUE_SCREEN.init();
    }
}