private void checkPAN() {
    boolean foundCard = false;
    for (int[] cardDB1 : cardDB) {
        if ((cardDB1[0]) == (cardPan)) {
            output.setText("Please enter your PIN");
            SATM_GUI.state = 1;
            foundCard = true;
            cardPin = cardDB1[1];
            break;
        }
    }
    if (foundCard == false) {
        rejectCard();
    }
}