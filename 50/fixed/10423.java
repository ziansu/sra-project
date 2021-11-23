private int getRandomValue(final int min, final int max) {
    return min + (new java.util.Random().nextInt(getRange(min, max)));
}