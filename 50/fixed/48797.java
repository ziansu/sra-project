public void roll() {
    java.util.Random rand = new java.util.Random();
    this.value = (rand.nextInt(this.sides)) + 1;
}