public static void Recording() {
    if (org.usfirst.frc.team245.robot.GhostModeWrite.recordingGhost = true) {
        double triggerValue = Gamepad.primary.getTriggers();
        double joystickValue = Gamepad.primary.getLeftX();
        long timeStamp = (org.usfirst.frc.team245.robot.GhostModeWrite.startTime) - (java.lang.System.nanoTime());
        double[] myIntArray = new double[]{ triggerValue , joystickValue , ((double) (timeStamp)) };
        org.usfirst.frc.team245.robot.GhostModeWrite.arrayContainer[org.usfirst.frc.team245.robot.GhostModeWrite.index] = myIntArray;
        (org.usfirst.frc.team245.robot.GhostModeWrite.index)++;
    }else {
    }
}