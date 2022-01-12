public boolean shouldExecute() {
    net.minecraft.entity.EntityLivingBase target = this.creeper.getAttackTarget();
    int blastSize = creeperHooks.getExplosionSize();
    return (((this.creeper.getCreeperState()) > 0) || (canBreachEntity(target))) || ((target != null) && ((this.creeper.getDistanceSqToEntity(target)) < (blastSize * blastSize)));
}