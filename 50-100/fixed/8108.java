static int randNum(int min, int max) {
    java.util.Random rand = new java.util.Random();
    if (min > max) {
        min = 0;
        max = 0;
    }
    int top = (max - min) + 1;
    if (top <= 0) {
        top = 1;
    }
    int randomInt = (rand.nextInt(top)) + min;
    return randomInt;
}