public void roll() {
    java.util.Random rand = new java.util.Random();
    value = (rand.nextInt(this.sides)) + 1;
}