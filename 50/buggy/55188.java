private void submitted() {
    java.lang.String response = baseController.calculatedAnswer(p1Answer);
    winner.setText((response + " is the winner!"));
}