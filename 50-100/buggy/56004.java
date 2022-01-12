public java.lang.String printHumanHand() {
    java.lang.String handStr = "";
    for (poker.PokerPlayer player : pokerPlayers) {
        if ((player.getClass().getName().equals("poker.PokerPlayer")) && (player.inHand)) {
            poker.HandOfCards hand = player.playerHand;
            java.lang.System.out.println(("\nYour Current Hand: -> " + (hand.getHandType())));
            handStr = hand.toString();
        }
    }
    return handStr;
}