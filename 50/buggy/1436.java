@java.lang.Override
public void resetRainAndThunder() {
    if (org.winterblade.minecraft.harmony.world.ProxiedWorldProvider.weatherLockedDims.contains(getDimension()))
        return ;
    
    wrapped.resetRainAndThunder();
}