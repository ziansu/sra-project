public void nextRound() {
    Round.setText(("Round " + ((start) - 1)));
    pt.makeEmpty();
    (start)++;
    pickNumber(3);
    control = 0;
    turn = 0;
    CorrectNum.setText("0");
}