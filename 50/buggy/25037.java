public static void autoStop() {
    Systems.AutoDriveAssembly.drive(0.0, 0.0, 0.0);
    Systems.AutoDriveAssembly.resetMotors();
}