@java.lang.Override
public int[] getVisibleWindow(jumpingalien.model.World world) {
    return jumpingalien.model.Utilities.intVectorToArray(world.getVisibleWindowSize());
}