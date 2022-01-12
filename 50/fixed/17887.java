public void setSpeed(double value) {
    org.ingrahamrobotics.robot2015.output.Output.output(OutputLevel.RAW_MOTORS, "VerticalClawShifter:Speed", value);
}