protected void onImpact(net.minecraft.util.MovingObjectPosition mop) {
    if (!(worldObj.isRemote)) {
        if ((mop.typeOfHit) == (mop.typeOfHit.BLOCK)) {
            worldObj.createExplosion(null, mop.blockX, mop.blockY, mop.blockZ, 4, allowExplosions);
        }else
            if ((mop.typeOfHit) == (mop.typeOfHit.ENTITY)) {
                worldObj.createExplosion(null, mop.entityHit.posX, mop.entityHit.posY, mop.entityHit.posZ, 4, allowExplosions);
            }
        
        setDead();
    }
}