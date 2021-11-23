public static java.util.LinkedList<com.company.Card> getnewCard(java.util.LinkedList<com.company.Card> hand, java.util.LinkedList<java.lang.String> takenCards) {
    com.company.Card newCard = com.company.Card.getrandomCard();
    java.lang.String newCardString = newCard.toString();
    boolean retry = takenCards.contains(newCardString);
    if (retry == true) {
        newCard = com.company.Card.getrandomCard();
    }else
        if (retry == false) {
            takenCards.add(newCardString);
            hand.add(newCard);
        }
    
    return hand;
}