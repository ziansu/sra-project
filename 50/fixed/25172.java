private int randButton(int min, int max) {
    rand = new java.util.Random();
    return (rand.nextInt(((max - min) + 1))) + min;
}