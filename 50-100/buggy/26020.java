public static int turnOneBid(int currentPlayer, com.example.james.cardsuite.BridgePlayer player, com.example.james.cardsuite.BridgeManager manager) {
    com.example.james.cardsuite.Card c = player.hand.get(0);
    if (c.getSuit().equals(manager.trumpSuit))
        return 1;
    else
        if (currentPlayer == (manager.startPlayer))
            if ((c.getCardNumber()) > 10)
                return 1;
            else
                if (currentPlayer == (((manager.startPlayer) + 3) % 4))
                    if ((manager.addedGuesses) > 0)
                        return 1;
                    
                
            
        
    
    return 0;
}