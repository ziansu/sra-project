public void displayNextCardOnScreen() {
    if (setCardDisplayRandom) {
        setRandomNumberForCardDisplayScreen();
        cardText.setText(getWordCardFromDeck().getWordSide());
    }else {
        if ((currentCard) < (numOfCardsInDeck)) {
            (currentCard)++;
            cardText.setText(getWordCardFromDeck().getWordSide());
        }else {
            currentCard = 0;
            cardText.setText(getWordCardFromDeck().getWordSide());
        }
    }
}