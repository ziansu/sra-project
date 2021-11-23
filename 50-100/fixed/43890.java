@java.lang.Override
protected void execute() {
    actualAngle = driveSubsystem.getAngle();
    driveAngle = (setAngle) - (actualAngle);
    log(Level.DEBUG, "execute", ((((("setAngle=" + (setAngle)) + ", actualAngle=") + (actualAngle)) + ", driveAngle=") + (driveAngle)));
    driveSubsystem.move(autoSpeed, driveAngle);
}