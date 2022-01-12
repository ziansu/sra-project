protected void execute() {
    int index;
    index = (org.usfirst.frc.team68.robot.MathUtil.findClosestIndex(RobotMap.intakePositions, org.usfirst.frc.team68.robot.subsystems.Intake.getIntake().getIntakeArm())) + 1;
    if (index > ((RobotMap.intakePositions.length) - 1))
        index = (RobotMap.intakePositions.length) - 1;
    
    org.usfirst.frc.team68.robot.subsystems.Intake.getIntake().setIntakeArm(org.usfirst.frc.team68.robot.RobotMap.intakePositions[index]);
    isDone = true;
}