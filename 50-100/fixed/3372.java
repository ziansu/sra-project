public void jump() {
    final boolean isNotInMidAir = !(this.isInMidAir);
    final boolean hasNotDoubleJumped = !(this.hasDoubleJumped);
    if (isNotInMidAir || hasNotDoubleJumped) {
        if ((this.isInMidAir) && hasNotDoubleJumped) {
            this.hasDoubleJumped = true;
        }
        this.audioManager.getAudioController().playSound(AudioFx.JUMP, 0.25F);
        applyImpulse(0, (-(com.omnicrola.pixelblaster.main.GameSettings.PLAYER_JUMP_SPEED)));
        addPlayerState(PlayerState.JUMP);
    }
}