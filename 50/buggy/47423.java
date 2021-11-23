public static int randInt(int min, int max) {
    java.util.Random randGenerator = new java.util.Random();
    int randNumber = (randGenerator.nextInt(((max - min) + 1))) + min;
    return randNumber;
}