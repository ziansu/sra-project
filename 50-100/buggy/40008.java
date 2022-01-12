private int getRandomValue(int min, int max) {
    long value = ((long) (rand.nextInt()));
    return ((int) (((value - ((long) (java.lang.Integer.MIN_VALUE))) % (max - min)) + min));
}