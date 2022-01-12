@java.lang.Override
public void update(java.util.Observable o, java.lang.Object arg) {
    if (o.getClass().getSimpleName().equals("CurrentScoreModel")) {
        scoreTextField.setText(((currentScore.getCurrentScore()) + ""));
        movesRemaining.setText(((currentScore.getNumberMoves()) + ""));
    }
}