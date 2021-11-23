@java.lang.Override
public net.minecraft.entity.player.EntityPlayer.EnumStatus getSleepPossibility(net.minecraft.world.World world, stellarapi.api.celestials.CelestialEffectors lightSource, stellarapi.api.ICelestialCoordinate coordinate, long sleepTime) {
    stellarapi.api.celestials.ICelestialObject sun = lightSource.getPrimarySource();
    double offset = coordinate.offsetTillObjectReach(sun.getCurrentAbsolutePos(), this.wakeAngle);
    if (java.lang.Double.isNaN(offset))
        return net.minecraft.entity.player.EntityPlayer.EnumStatus.NOT_POSSIBLE_HERE;
    
    return world.provider.isDaytime() ? net.minecraft.entity.player.EntityPlayer.EnumStatus.NOT_POSSIBLE_NOW : net.minecraft.entity.player.EntityPlayer.EnumStatus.OK;
}