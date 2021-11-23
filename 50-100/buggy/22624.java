public void driveTR() {
    long millisecondsToRunTR = 1000;
    long initTime = edu.wpi.first.wpilibj.Utility.getFPGATime();
    while (((edu.wpi.first.wpilibj.Utility.getFPGATime()) - initTime) <= millisecondsToRunTR) {
        leftTalon0.set(0);
        leftTalon1.set(0);
        rightTalon0.set(1);
        rightTalon1.set(1);
    } 
}