public static java.util.LinkedList<com.company.Card> getnewCard(java.util.LinkedList<com.company.Card> hand, java.util.LinkedList<com.company.Card> takenCards) {
    com.company.Card newCard = com.company.Card.getrandomCard();
    boolean retry = takenCards.contains(newCard);
    if (retry == true) {
        newCard = com.company.Card.getrandomCard();
    }else
        if (retry == false) {
            takenCards.add(newCard);
            hand.add(newCard);
        }
    
    return hand;
}