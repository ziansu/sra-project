public void tick() {
    super.tick();
    if ((goingBack) && ((traveledDistance) > ((distance) * 5))) {
        hitOwner();
    }
    (soundTimer)--;
    if ((soundTimer) <= 0) {
        soundTimer = 5;
        playMoveSound();
    }
}