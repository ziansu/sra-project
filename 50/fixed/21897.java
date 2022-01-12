private int randomNumberGenerator(int min, int max) {
    java.util.Random rand = new java.util.Random();
    return (rand.nextInt((max - min))) + min;
}