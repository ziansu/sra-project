@java.lang.Override
public boolean shouldExecute() {
    net.minecraft.entity.EntityLivingBase favoriteTarget = this.entityHost.getAttackTarget();
    if (favoriteTarget == null) {
        return false;
    }
    double distSquared = this.entityHost.getDistanceSq(favoriteTarget.posX, favoriteTarget.getEntityBoundingBox().minY, favoriteTarget.posZ);
    if (distSquared > ((double) (this.attackRadiusSquared))) {
        return false;
    }
    java.lang.System.out.println(("EntityAIHoldAndShoot: engaging with target=" + favoriteTarget));
    this.attackTarget = favoriteTarget;
    return true;
}