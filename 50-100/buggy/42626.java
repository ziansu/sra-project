@java.lang.Override
public void OnTimerTick() {
    vehicledynamics.Update();
    java.lang.System.out.print(("Gas: " + (bus.getGasPedal())));
    java.lang.System.out.print(("Brake: " + (bus.getBrakePedal())));
    java.lang.System.out.print(("Gear: " + (bus.getGearPosition())));
    java.lang.System.out.print(("Acceleration: " + (bus.getAcceleration())));
    java.lang.System.out.print(("Speed: " + (bus.getCurrentSISpeed())));
    java.lang.System.out.print("\n");
}