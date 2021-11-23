@java.lang.Override
public long getWakeTime(net.minecraft.world.World world, stellarium.api.ISkyProvider skyProvider, long sleepTime) {
    double wakeDayOffset = skyProvider.dayOffsetUntilSunReach(this.wakeAngle);
    double currentDayOffset = skyProvider.getDaytimeOffset(sleepTime);
    double dayLength = skyProvider.getDayLength();
    double modifiedWorldTime = sleepTime + ((wakeDayOffset - currentDayOffset) * dayLength);
    while (modifiedWorldTime < sleepTime)
        modifiedWorldTime += dayLength;
    
    return ((long) (modifiedWorldTime));
}