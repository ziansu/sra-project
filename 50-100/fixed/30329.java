public void spawn() {
    java.util.Random random = new java.util.Random();
    this.xPosition = 1280 + ((this.size) / 2);
    this.yPosition = ((double) (random.nextInt((721 - ((int) ((this.size) / 2)))))) + ((int) ((this.size) / 2));
}