public void driveTL() {
    long millisecondsToRunTL = 500;
    long initTime = edu.wpi.first.wpilibj.Utility.getFPGATime();
    while (((edu.wpi.first.wpilibj.Utility.getFPGATime()) - initTime) <= millisecondsToRunTL) {
        leftTalon0.set(1);
        leftTalon1.set(1);
        rightTalon0.set(0);
        rightTalon1.set(0);
    } 
}