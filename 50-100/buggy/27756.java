@java.lang.Override
public void normalExplode() {
    if (!(this.isExpoding)) {
        isExpoding = true;
        if (!(this.worldObj.isRemote)) {
            worldObj.createExplosion(this, this.posX, this.posY, this.posZ, 5.0F, true);
        }
        setDead();
    }
}