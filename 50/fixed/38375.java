public void attackEntityWithRangedAttack(net.minecraft.entity.EntityLivingBase target, float distanceFactor) {
    float damageAmount = 1;
    SuperDopeJediMod.weaponManager.ThrowPlasmaShotRed(worldObj, this, target, distanceFactor, damageAmount);
}