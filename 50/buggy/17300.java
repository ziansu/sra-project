@java.lang.Override
protected boolean canDespawn() {
    return (super.canDespawn()) && (!(this.hasCustomNameTag()));
}