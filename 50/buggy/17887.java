public void setSpeed(double value) {
    motor.set(value);
    org.ingrahamrobotics.robot2015.output.Output.output(OutputLevel.RAW_MOTORS, "VerticalClawShifter:Speed", value);
}