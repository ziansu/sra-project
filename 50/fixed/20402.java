public void fillRandoNumber(int maxNumber) {
    java.util.Random random = new java.util.Random();
    this.randoNumber = (random.nextInt(maxNumber)) + 1;
}