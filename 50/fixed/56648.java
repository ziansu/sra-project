public void onLivingUpdate() {
    super.onLivingUpdate();
    this.bossInfo.setPercent(((this.getHealth()) / (this.getMaxHealth())));
}