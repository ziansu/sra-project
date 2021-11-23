@java.lang.Override
public boolean equals(final java.lang.Object otherObj) {
    if ((otherObj instanceof com.valkryst.VRoguelike.components.PositionComponent) == false) {
        return false;
    }
    if (otherObj == (this)) {
        return true;
    }
    final com.valkryst.VRoguelike.components.PositionComponent otherComp = ((com.valkryst.VRoguelike.components.PositionComponent) (otherObj));
    boolean isEqual = (x) == (otherComp.getX());
    isEqual &= (y) == (otherComp.getY());
    return isEqual;
}