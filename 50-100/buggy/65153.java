private void checkBothTurnedBack() {
    if ((cards.get(selectedCardOne).isFaceDown()) && (cards.get(selectedCardTwo).isFaceDown())) {
        sendData.endTurn();
        selectedCardOne = -1;
        selectedCardTwo = -1;
        toggleCards(false);
    }
}