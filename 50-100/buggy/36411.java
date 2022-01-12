public void flinch() {
    float knockbackForce = 1000.0F * (characterBody.getMass());
    if (isFacingRight) {
        knockbackForce *= -1;
    }
    characterBody.applyForceToCenter(knockbackForce, 0, true);
    if (!(isDead)) {
        currPunchNum = -1;
        punchingTimer.stop();
        currFlinchNum = 1;
        flinchTimer.start();
    }
}