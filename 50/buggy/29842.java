public int getRandomCoolThingIndex() {
    java.util.Random rand = new java.util.Random();
    return rand.nextInt(mListOfCoolThings.size());
}