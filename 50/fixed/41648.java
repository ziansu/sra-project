private int randomWorldSize() {
    java.util.Random random = new java.util.Random();
    int worldSize = (random.nextInt(10000)) + 5000;
    return worldSize;
}