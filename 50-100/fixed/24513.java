public void update(float deltaFloat, float containerHeight, float containerWidth, boolean testing) {
    if ((!(gs.isPaused())) && ((shieldTimeRemaining) > 0)) {
        shieldTimeRemaining -= deltaFloat * (logic.Player.SECONDS_TO_MS);
    }
    java.lang.System.out.println(deltaFloat);
    processGates();
    processWeapon(deltaFloat, containerHeight, testing);
    processPlayerMovement(deltaFloat, containerWidth, testing);
    processPowerups(deltaFloat, containerHeight, containerWidth);
    processCoins(deltaFloat, containerHeight);
}