public int dealCard(final java.util.Random random, int[] deck, int numCards) {
    int ret = -1;
    int i = (random.nextInt()) % numCards;
    ret = deck[i];
    deck[i] = deck[(numCards - 1)];
    return ret;
}