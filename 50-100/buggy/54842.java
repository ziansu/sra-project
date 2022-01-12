public static void defaultInitGame(com.gfarcasiu.game.Game game) {
    java.util.List<com.gfarcasiu.game.PlayingCard> cards = new java.util.ArrayList<>();
    for (int val = 2; val <= 14; val++)
        for (int suit = 0; suit <= 4; suit++)
            cards.add(new com.gfarcasiu.game.PlayingCard(val, suit, true));
        
    
    game.initDeck(cards);
}