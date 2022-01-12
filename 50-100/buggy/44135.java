private void showRoundInfo(java.lang.String text1, java.lang.String text2, float textSize, int delay) {
    java.lang.String labelText1;
    java.lang.String labelText2;
    if ((text1 == "") && (text2 == "")) {
        labelText1 = "Runde " + (round);
        labelText2 = ("Spieler " + ((currentPlayerIndex) + 1)) + " beginnt!";
    }else {
        labelText1 = text1;
        labelText2 = text2;
    }
    view.showGameInfo(labelText1, labelText2, textSize, delay);
}