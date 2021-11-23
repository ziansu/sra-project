@java.lang.Override
protected void handleDefeat() {
    setVisible(false);
    this.deathCoolDown = com.mtrubs.td.scene.PcActor.getType().getDeathCoolDown();
}