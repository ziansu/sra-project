@java.lang.Override
public void onUpdate() {
    if (((this.particleAge)++) >= (this.particleMaxAge)) {
        this.setExpired();
    }
    this.prevPosX = this.posX;
    this.prevPosY = this.posY;
    this.prevPosZ = this.posZ;
    this.moveEntity(this.motionX, this.motionY, this.motionZ);
    this.particleScale *= 0.85F;
}