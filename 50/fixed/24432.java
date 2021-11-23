public void robotInit() {
    org.usfirst.frc.team4564.robot.Robot.table = edu.wpi.first.wpilibj.networktables.NetworkTable.getTable("dashTable");
    dt = new org.usfirst.frc.team4564.robot.DriveTrain();
}