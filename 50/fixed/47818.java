@java.lang.Override
public org.strongback.components.TalonSRX setForwardSoftLimit(int forwardLimitDegrees) {
    if ((this.selectedInput) != null) {
        double rawPosition = this.selectedInput.rawPositionForAngleInDegrees(forwardLimitDegrees);
        talon.setForwardSoftLimit(((int) (rawPosition)));
    }
    return this;
}