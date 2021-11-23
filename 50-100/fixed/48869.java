public void addCardsForDealer(java.util.ArrayList<java.lang.String> dealerSuit, java.util.ArrayList<java.lang.String> dealerValue) {
    for (int i = 0; i < (dealerSuit.size()); i++) {
        addPlayerCard(dealerSuit.get(i), dealerValue.get(i));
    }
}