private guiPacket.Card removeCardFromHand(guiPacket.Card cardToRemove) {
    for (int i = 0; i < (hand.size()); i++) {
        if ((cardToRemove.compareTo(hand.get(i))) == 0) {
            hand.remove(i);
            if ((cardToRemove instanceof cards.Tech) || (cardToRemove instanceof cards.ResourceCard)) {
                addCardToScrapYard(cardToRemove);
            }
            return cardToRemove;
        }
    }
    java.lang.System.out.println("RemoveCardFromHand: Something went wrong");
    return null;
}