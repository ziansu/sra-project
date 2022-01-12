public void potHandle(int chosen, int currentPlayer) {
    com.example.james.cardsuite.Card selectCard = players[currentPlayer].hand.remove(chosen);
    if (currentPlayer == (startPlayer))
        startSuit = selectCard.getSuit();
    else
        if ((!(heartsBroken)) && (selectCard.getSuit().equals(Card.Suit.HEARTS)))
            heartsBroken = true;
        
    
    pot.put(currentPlayer, selectCard);
}