public static boolean isFlush(java.util.ArrayList<Card> h) {
    if ((h.size()) != 5) {
        return false;
    }
    char ch = h.get(0).getSuit();
    for (Card c : h) {
        if ((c.getSuit()) != ch) {
            return false;
        }
    }
    return true;
}