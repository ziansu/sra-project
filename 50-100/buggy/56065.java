public boolean flipCard(Player currentPlayer) {
    java.lang.System.out.println("flip");
    if ((currentPlayer.getHand().isEmpty()) && (cards.isEmpty())) {
        return false;
    }
    if (!(currentPlayer.getHand().isEmpty())) {
        Card flippingCard = currentPlayer.drawCard();
        cards.add(0, flippingCard);
    }
    repaint();
    return true;
}