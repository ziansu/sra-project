public static int getRandomInRange(int min, int max) {
    if (max < min) {
        int temp = max;
        max = min;
        min = temp;
    }
    java.util.Random rand = new java.util.Random();
    return (rand.nextInt((max - min))) + min;
}