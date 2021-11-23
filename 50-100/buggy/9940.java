private void handleLevelUp() {
    if ((xpSinceLastLevelUp()) >= (nettoXpNeededForLevel(((plevel) + 1)))) {
        (this.maxHealth)++;
        this.regenDelay = 2;
        (plevel)++;
        psprint += 0.1;
        maxTimeSprint += 20;
        MojamComponent.soundPlayer.playSound("/sound/levelUp.wav", ((float) (pos.x)), ((float) (pos.y)), true);
    }
}