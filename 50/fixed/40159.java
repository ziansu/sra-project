@java.lang.Override
public boolean canSleep(net.minecraft.world.World world, long sleepTime) {
    return !(world.isDaytime());
}