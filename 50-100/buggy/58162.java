private void onDamage() {
    shootMultiplikator = ((int) (java.lang.Math.ceil(((shootMultiplikator) / 2.0))));
    setFireRate(((fireRate) - (com.starproductions.starmotion.starmotion.GameConstants.FIREUP_FACTOR)));
    life -= 1;
    gameEngine.playSound(SoundEffects.PlayerHit);
    if ((life) <= 0) {
        this.destroy();
        gameEngine.playSound(SoundEffects.Explosion);
        gameEngine.gameOver();
    }
}