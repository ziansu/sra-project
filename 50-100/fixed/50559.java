private void makeSubsystems() {
    org.usfirst.frc.team2175.robot.Robot.drivetrain = new org.usfirst.frc.team2175.robot.subsystems.Drivetrain();
    org.usfirst.frc.team2175.robot.Robot.toteElevator = new org.usfirst.frc.team2175.robot.subsystems.ToteElevator();
    org.usfirst.frc.team2175.robot.Robot.containerElevator = new org.usfirst.frc.team2175.robot.subsystems.ContainerElevator();
    org.usfirst.frc.team2175.robot.Robot.toteIntake = new org.usfirst.frc.team2175.robot.subsystems.ToteIntake();
    org.usfirst.frc.team2175.robot.Robot.containerIntake = new org.usfirst.frc.team2175.robot.subsystems.ContainerIntake();
    org.usfirst.frc.team2175.robot.Robot.toteRamp = new org.usfirst.frc.team2175.robot.Ramp(org.usfirst.frc.team2175.robot.Robot.properties.toteConfig.toteConfig);
    org.usfirst.frc.team2175.robot.Robot.containerRamp = new org.usfirst.frc.team2175.robot.Ramp(org.usfirst.frc.team2175.robot.Robot.properties.containerConfig.containerConfig);
}