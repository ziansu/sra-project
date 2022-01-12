public void activate() {
    this.activated = true;
    if (this.disableUnitControl) {
        this.owner.unitControl = false;
    }
    if (this.pauseWhenActivated) {
        this.getMap().pauseAll();
        this.setPause(false);
        this.getMap().getUI().addUIElement(this.spellText);
    }
    if (!(this.pauseWhenActivated)) {
        this.onActivate();
        this.spellExecuted = true;
    }
}