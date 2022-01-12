public static boolean isValidAskedCard(org.ucoz.intelstat.gc.GCard card, org.ucoz.intelstat.gc.GCard.Suit suit) {
    if ((card.getSuit()) == suit) {
        return true;
    }
    if ((card.getRank()) == (GCard.Rank.SEVEN)) {
        return true;
    }
    java.lang.System.err.println("INVALID MOVE IN ASKED CARD");
    return false;
}