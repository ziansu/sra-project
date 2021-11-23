@java.lang.Override
public void resetTask() {
    this.target = null;
    this.revengeTimerOld = 0;
    this.taskOwner.setRevengeTarget(null);
    this.taskOwner.setAttackTarget(null);
}