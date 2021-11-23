@io.github.robotpy.magicbot.sm.State
public void rotateTo() {
    if ((drivetrain.rotateTo(0)) == true) {
        nextState("driveForwardAgain");
    }
}