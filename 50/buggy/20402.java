public int fillRandoNumber(int maxNumber) {
    java.util.Random random = new java.util.Random();
    randoNumber = (random.nextInt(maxNumber)) + 1;
    return randoNumber;
}