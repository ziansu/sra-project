protected boolean isAtPathEnd() {
    com.dreamteam.villageTycoon.utils.Debug.print(this, ("distance to path target = " + (distanceTo(lastPathTarget))));
    return (distanceTo(lastPathTarget)) < 0.2F;
}