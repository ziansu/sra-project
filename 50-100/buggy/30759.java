public void initializeHardware() {
    driveAssemblies[FRONT_RIGHT].motor = hardwareMap.dcMotor.get("motorFrontRight");
    driveAssemblies[FRONT_LEFT].motor = hardwareMap.dcMotor.get("motorFrontLeft");
    driveAssemblies[BACK_RIGHT].motor = hardwareMap.dcMotor.get("motorBackRight");
    driveAssemblies[BACK_LEFT].motor = hardwareMap.dcMotor.get("motorBackLeft");
    drive = new org.firstinspires.ftc.team6220.DriveSystem(driveAssemblies, new org.firstinspires.ftc.team6220.Transform2D(0.0, 0.0, 0.0), new org.firstinspires.ftc.team6220.PIDFilter(1.0, 0.0, 0.0), PIDEnforcementMode.NONE);
}