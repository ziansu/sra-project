public void displayNextCardOnScreen() {
    if (setCardDisplayRandom) {
        setRandomNumberForCardDisplayScreen();
        cardText.setText(getWordCardFromDeck().getWordSide());
    }else {
        if ((currentCard) <= (numOfCardsInDeck)) {
            cardText.setText(getWordCardFromDeck().getWordSide());
            (currentCard)++;
        }else {
            currentCard = 0;
            cardText.setText(getWordCardFromDeck().getWordSide());
            (currentCard)++;
        }
    }
}