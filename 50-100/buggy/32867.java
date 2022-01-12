private void clearTable() {
    while ((dealerCards.pop()) != null);
    while ((playerCards.pop()) != null);
    while ((dealerTempCards.pop()) != null);
    while ((playerTempCards.pop()) != null);
}