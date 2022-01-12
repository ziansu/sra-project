public int getCurrentVelocity() {
    if (((game) != null) && (game.useVectorMove())) {
        return getVelocity();
    }
    return currentVelocity;
}