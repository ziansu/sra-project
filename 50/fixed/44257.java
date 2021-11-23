private void setRandomSpeed() {
    final int vx = (random.nextInt(3)) - 1;
    final int vy = (random.nextInt(3)) - 1;
    entityBody.setVelocity(vx, vy);
}