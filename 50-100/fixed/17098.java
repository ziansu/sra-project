private static boolean hasMovedToShootingPostion() {
    boolean done = false;
    org.usfirst.frc.team339.Utils.DriveInstruction currentInstruction = org.usfirst.frc.team339.robot.Autonomous.driveToGoalInstructions[Hardware.startingPositionDial.getPosition()][org.usfirst.frc.team339.robot.Autonomous.driveToShootingPositionStep];
    if ((Hardware.drive.driveForwardInches(currentInstruction.getForwardDistance())) || (Hardware.drive.driveForwardInches(currentInstruction.getRotationalDistance()))) {
        {
            (org.usfirst.frc.team339.robot.Autonomous.driveToShootingPositionStep)++;
            if (currentInstruction.isTerminator()) {
                done = true;
            }
        }
        if (currentInstruction.isTerminator()) {
            done = true;
        }
    }
    return done;
}