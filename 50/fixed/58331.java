private void printRowOfCards(Card[] playerCards) {
    for (Card c : playerCards) {
        if (c != null) {
            java.lang.System.out.print((c + " "));
        }
    }
}