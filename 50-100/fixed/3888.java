@java.lang.Override
public void postTick() {
    (tickCounter)++;
    if (((tickCounter) % (intervalTicks)) == 0) {
        com.github.fishio.power_ups.PowerUp pu = getRandomPowerUp();
        pf.add(pu);
        log.log(LogLevel.DEBUG, (("Added a PowerUp of type \"" + (pu.getName())) + "\""));
    }
}