private int getRandomShuffleCountThatDoesntResetDeck() {
    int numberOfShuffles = 0;
    do {
        numberOfShuffles = (org.apache.commons.lang3.RandomUtils.nextInt(1, 100)) + 1;
    } while ((numberOfShuffles % 8) == 0 );
    return numberOfShuffles;
}