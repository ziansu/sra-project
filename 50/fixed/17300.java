@java.lang.Override
protected boolean canDespawn() {
    return !(this.hasCustomNameTag());
}