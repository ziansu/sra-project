public void setRandomSpeed() {
    this.setSpeed((((rd.nextDouble()) + 1) - ((rd.nextDouble()) * (rd.nextInt(2)))));
}