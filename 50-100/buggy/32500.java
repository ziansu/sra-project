public static void shuffle(java.lang.Object[] toShuffle) {
    java.util.Random r = new java.util.Random();
    int j;
    java.lang.Object temp;
    for (int i = (toShuffle.length) - 1; i > 0; i--) {
        j = r.nextInt(i);
        temp = toShuffle[j];
        toShuffle[j] = toShuffle[i];
        toShuffle[i] = temp;
    }
}