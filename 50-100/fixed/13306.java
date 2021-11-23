public void driveS() {
    long initTime = edu.wpi.first.wpilibj.Utility.getFPGATime();
    while (((edu.wpi.first.wpilibj.Utility.getFPGATime()) - initTime) <= (millisecondsToRunS)) {
        leftTalon0.set(1);
        leftTalon1.set(1);
        rightTalon0.set(1);
        rightTalon1.set(1);
    } 
}