public void livingEntityBaseTick() {
    this.aC = this.aD;
    this.aJ = this.aK;
    if ((this.hurtTicks) > 0) {
        this.hurtTicks -= 1;
    }
    tickPotionEffects();
    this.aZ = this.aY;
    this.aO = this.aN;
    this.aQ = this.aP;
    this.lastYaw = this.yaw;
    this.lastPitch = this.pitch;
}