@java.lang.Override
public void normalExplode() {
    if (!(isExpoding)) {
        isExpoding = true;
        if (!(worldObj.isRemote)) {
            worldObj.createExplosion(this, posX, posY, posZ, 5.0F, true);
        }
        setDead();
    }
}