private void checkPowerBounds(io.developersguild.rebelinvader.components.PowerComponent power) {
    if ((power.currentPower) <= 0) {
        power.currentPower = 0;
        isPowerup = false;
    }
    if (((power.currentPower) >= (power.maxPower)) && (!(isPowerup))) {
        screen.activatePower();
        Assets.powerup.play(0.4F);
        isPowerup = true;
    }
    if ((power.target.getComponent(io.developersguild.rebelinvader.components.PlayerComponent.class)) != null) {
        power.target.getComponent(io.developersguild.rebelinvader.components.PlayerComponent.class).currentPower = power.currentPower;
    }
}