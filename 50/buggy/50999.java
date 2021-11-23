@java.lang.Override
protected void handleDefeat() {
    despawn();
    setVisible(false);
    this.deathCoolDown = com.mtrubs.td.scene.PcActor.getType().getDeathCoolDown();
}