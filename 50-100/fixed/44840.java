public java.util.List<entities.chance.ChanceCard> getCards() {
    java.util.List<entities.chance.ChanceCard> cards = new java.util.ArrayList<>();
    cards.addAll(initializePay());
    cards.addAll(initializeReceive());
    cards.addAll(initializeMove());
    cards.addAll(initializeMoveToFixed());
    cards.addAll(initializeGoToJail());
    cards.addAll(initializeGetOutOfJail());
    return cards;
}