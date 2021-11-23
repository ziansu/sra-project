@java.lang.Override
public void resetTask() {
    java.lang.System.out.println("EntityAIQuicklyOffended: resetting");
    this.target = null;
    this.revengeTimerOld = 0;
    this.taskOwner.setRevengeTarget(null);
    this.taskOwner.setAttackTarget(null);
}