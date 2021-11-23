private guiPacket.Card removeCardFromHand(guiPacket.Card cardToRemove) {
    for (int i = 0; i < (hand.size()); i++) {
        if ((cardToRemove.compareTo(hand.get(i))) == 0) {
            hand.remove(i);
            return cardToRemove;
        }
    }
    java.lang.System.out.println("RemoveCardFromHand: Something went wrong");
    return null;
}