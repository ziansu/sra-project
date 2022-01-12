private void explode(tm.fissionwarfare.missile.MissileData missileData) {
    if ((missileData != null) && ((missileData.getExplosionType()) != null)) {
        tm.fissionwarfare.api.IExplosionType explosion = missileData.getExplosionType().getExplosionType();
        explosion.setup(worldObj, getVector());
        if (!(worldObj.isRemote)) {
            explosion.doBlockDamage();
            explosion.doPlayerDamage();
        }
        explosion.doEffects();
    }
    setDead();
}