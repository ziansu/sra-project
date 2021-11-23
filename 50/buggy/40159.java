@java.lang.Override
public boolean canSleep(net.minecraft.world.World world, long sleepTime) {
    return (!(world.isDaytime())) && ((stellarium.util.math.Spmath.fmod(((world.getCelestialAngle(1.0F)) - 0.75F), 1.0F)) > 0.5F);
}