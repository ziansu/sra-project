public void onLivingUpdate() {
    this.bossInfo.setPercent(((this.getHealth()) / (this.getMaxHealth())));
}