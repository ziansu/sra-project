@java.lang.Override
public boolean canBeTargeted(java.lang.Object turret) {
    return (this.getTicksInAir()) > 0;
}