public void tick() {
    super.tick();
    if ((goingBack) && ((traveledDistance) > (distance))) {
        hitOwner();
    }
    (soundTimer)--;
    if ((soundTimer) <= 0) {
        soundTimer = 5;
        playMoveSound();
    }
}