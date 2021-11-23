private int rndNumber(int input) {
    java.util.Random rnd = new java.util.Random();
    int i = rnd.nextInt(input);
    return i;
}