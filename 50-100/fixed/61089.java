private void dice1() {
    dice1Selected = true;
    dice2Selected = false;
    if (!(dice2removed)) {
        diceImage2.clearColorFilter();
        diceImage2.setImageDrawable(getDiceImage(getDice2Value()));
    }
    diceImage1.setColorFilter(backgroundColor, PorterDuff.Mode.MULTIPLY);
    infoText.setText(("Mögliche Züge mit " + (getDice1Value())));
    game.setSelectedDiceNumber(getDice1Value(), 1, true);
}