public void update(float deltaFloat, float containerHeight, float containerWidth, boolean testing) {
    if ((!(gs.isPaused())) && ((shieldTimeRemaining) > 0)) {
        shieldTimeRemaining -= deltaFloat * (logic.Player.SECONDS_TO_MS);
    }
    processGates();
    processWeapon(deltaFloat, containerHeight, testing);
    processPlayerMovement(deltaFloat, containerWidth, testing);
    processPowerups(containerHeight, containerWidth, deltaFloat);
    processCoins(deltaFloat, containerHeight);
}