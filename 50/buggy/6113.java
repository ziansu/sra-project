@java.lang.Override
public void nearByChange() {
    checkConnectedSides();
    getWorld().markBlockForUpdate(getX(), getY(), getZ());
}