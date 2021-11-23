public void attackEntityWithRangedAttack(net.minecraft.entity.EntityLivingBase target, float distanceFactor) {
    java.lang.System.out.println("ImperialProbe: attacking with ranged!");
    float damageAmount = 1;
    SuperDopeJediMod.weaponManager.ThrowPlasmaShotRed(worldObj, this, target, distanceFactor, damageAmount);
}