@java.lang.Override
public boolean continueExecuting() {
    net.minecraft.entity.EntityLivingBase revengeTarget = this.taskOwner.getAITarget();
    if (revengeTarget != (this.target)) {
        return false;
    }
    int revengeTick = this.taskOwner.getRevengeTimer();
    if (((this.taskOwner.ticksExisted) - revengeTick) > 20) {
        return false;
    }
    return true;
}