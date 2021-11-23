public void potHandle(int chosen, int currentPlayer) {
    com.example.james.cardsuite.Card selectCard = players[currentPlayer].hand.remove(chosen);
    if (currentPlayer == (startPlayer))
        startSuit = selectCard.getSuit();
    else
        if ((!(heartsBroken)) && ((selectCard.getSuit().equals(Card.Suit.HEARTS)) || ((selectCard.compareTo(new com.example.james.cardsuite.Card(12, Card.Suit.SPADES))) == 0)))
            heartsBroken = true;
        
    
    pot.put(currentPlayer, selectCard);
}