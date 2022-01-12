private void endGame(int winner) {
    view.resetWindow();
    java.lang.String text1 = "Herzlichen Gl�ckwunsch Spieler " + winner;
    java.lang.String text2 = "Sie haben gewonnen!";
    view.updateButton(false, "Spiel beendet");
    view.showGameInfo(text1, text2, 60.0F, 0, true);
    view.showGameInfo("Toll gemacht", "Vielen Dank f�r's Spielen!", 80.0F, 2100, false);
}