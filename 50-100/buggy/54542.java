@java.lang.Override
public boolean continueExecuting() {
    net.minecraft.entity.EntityLivingBase revengeTarget = this.taskOwner.getAITarget();
    if (revengeTarget != (this.target)) {
        java.lang.System.out.println("EntityAIQuicklyOffended: continueExecuting bailing because no target.");
        return false;
    }
    int revengeTick = this.taskOwner.getRevengeTimer();
    if (((this.taskOwner.ticksExisted) - revengeTick) > 20) {
        java.lang.System.out.println(("EntityAIQuicklyOffended: continueExecuting bailing because revengeTick=" + ((this.taskOwner.ticksExisted) - revengeTick)));
        return false;
    }
    return true;
}