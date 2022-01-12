private int getRandomValue(int min, int max) {
    if (min == max) {
        return min;
    }else {
        long value = ((long) (rand.nextInt()));
        return ((int) (((value - ((long) (java.lang.Integer.MIN_VALUE))) % (max - min)) + min));
    }
}