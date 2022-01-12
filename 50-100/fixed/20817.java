private void checkPAN() {
    boolean foundCard = false;
    for (int[] cardDB1 : cardDB) {
        if ((cardDB1[0]) == (cardPan)) {
            SATM_GUI.state = 1;
            output.setText("Please enter your PIN");
            foundCard = true;
            cardPin = cardDB1[1];
            break;
        }
    }
    if (foundCard == false) {
        rejectCard();
    }
}