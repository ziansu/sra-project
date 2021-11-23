static int randNum(int min, int max) {
    java.util.Random rand = new java.util.Random();
    int top = (max - min) + 1;
    if (top <= 0) {
        top = 1;
    }
    int randomInt = (rand.nextInt(top)) + min;
    return randomInt;
}