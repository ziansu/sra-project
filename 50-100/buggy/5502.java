public boolean UpdateLivingOrDead() {
    if ((this.HP.get()) == 0) {
        this.Readiness = -5000;
        this.Bleeding.set(false);
        this.Poisoned.set(false);
        this.Stunned.set(false);
        this.Alive.set(false);
        return true;
    }
    return false;
}