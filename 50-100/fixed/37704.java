private void extendTheLevel() {
    if ((currentDistanceInterval) < 160)
        currentDistanceInterval += 5;
    
    currentLevelY -= currentDistanceInterval;
    for (com.bradleywilcox.finaljumper.Platform p : platforms) {
        if (!(p.getIsActive())) {
            int randX = rand.nextInt(((Game.BUFFER_WIDTH) - (Platform.WIDTH)));
            p.setPosition(randX, currentLevelY);
            currentLevelY -= currentDistanceInterval;
        }
    }
}