public static int getImage(com.bishopireton.finalproject.Card card) {
    return com.bishopireton.finalproject.CardImages.IDS[card.getSuit()][((card.getRank()) - 1)];
}