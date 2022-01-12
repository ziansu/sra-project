private static int rando(int min, int max) {
    Random rand = new Random();
    int randomNum = (rand.nextInt(((max - min) + 1))) + min;
    return randomNum;
}