public void finishSpell() {
    this.isFinished = true;
    if (this.disableUnitControl) {
        (this.owner.unitControl)--;
    }
    if (this.pauseWhenActivated) {
        this.map.unpauseAll();
    }
    this.setRemove(true);
}