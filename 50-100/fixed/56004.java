public java.lang.String printHumanHand() {
    java.lang.String handStr = "";
    for (poker.PokerPlayer player : pokerPlayers) {
        if ((player.getClass().getName().equals("poker.PokerPlayer")) && (player.inHand)) {
            poker.HandOfCards hand = player.playerHand;
            handStr = hand.toString();
        }
    }
    return handStr;
}