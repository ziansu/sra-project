private void checkBothTurnedBack() {
    if ((cards.get(selectedCardOne).isFaceDown()) && (cards.get(selectedCardTwo).isFaceDown())) {
        selectedCardOne = -1;
        selectedCardTwo = -1;
        toggleCards(false);
        sendData.endTurn();
    }
}