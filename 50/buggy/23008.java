public void startExecuting() {
    this.taskOwner.setAttackTarget(this.theTarget);
    java.lang.System.out.println(("target set as " + (theTarget)));
    super.startExecuting();
}