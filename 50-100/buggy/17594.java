@java.lang.Override
protected void initialize() {
    double currentYaw = navigationSubsystem.getYaw();
    double desiredYaw = (((currentYaw + 180) + (degree)) % 360) - 180;
    java.lang.System.out.println(((("C: " + currentYaw) + " D: ") + desiredYaw));
    pidController.setSetpoint(desiredYaw);
    pidController.enable();
}