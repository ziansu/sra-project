public void computerRound() {
    if ((currentPlayer.length()) >= 9) {
        if ((currentPlayer.substring(0, 9).compareToIgnoreCase("Computer ")) == 0) {
            int random = ((int) (((java.lang.Math.random()) * 10) + 1));
            if (random < 9) {
                rollButton.doClick();
            }else {
                holdButton.doClick();
            }
        }
    }
}