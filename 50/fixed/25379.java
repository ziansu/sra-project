public void tick() {
    if ((lastReplenishTime) < ((java.lang.System.currentTimeMillis()) - (stats.getStaminaRefillRate()))) {
        lastReplenishTime = java.lang.System.currentTimeMillis();
        applyStamina(1);
    }
}