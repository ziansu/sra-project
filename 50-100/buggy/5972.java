public  IO() {
    speedUp.whenPressed(new org.usfirst.frc.team5243.robot.StrafeSpeedCommand(((strafeSpeed) + 0.1)));
    slowDown.whenPressed(new org.usfirst.frc.team5243.robot.StrafeSpeedCommand(((strafeSpeed) - 0.1)));
    leftStrafe.whileHeld(new org.usfirst.frc.team5243.robot.commands.StrafeCommand());
    rightStrafe.whileHeld(new org.usfirst.frc.team5243.robot.commands.StrafeCommand());
    resetButton.whenPressed(new org.usfirst.frc.team5243.robot.StrafeSpeedCommand(0));
    strafeTriggerLeft.whileHeld(new org.usfirst.frc.team5243.robot.commands.StrafeCommand());
    strafeTriggerRight.whileHeld(new org.usfirst.frc.team5243.robot.commands.StrafeCommand());
}