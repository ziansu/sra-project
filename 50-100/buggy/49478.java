public void robotInit() {
    org.usfirst.frc.team3182.robot.Robot3182.listOfPossibilities();
    org.usfirst.frc.team3182.robot.Robot3182.driveTrainVar = new org.usfirst.frc.team3182.robot.DriveTrain();
    new java.lang.Thread(org.usfirst.frc.team3182.robot.Robot3182.driveTrainVar, "DriveTrain").start();
    org.usfirst.frc.team3182.robot.Robot3182.lifterVar = new org.usfirst.frc.team3182.robot.Lifter();
    new java.lang.Thread(org.usfirst.frc.team3182.robot.Robot3182.lifterVar, "Lifter").start();
    arduinoLightsVar.setLightSequence(LightsEnum.RANDOM);
}