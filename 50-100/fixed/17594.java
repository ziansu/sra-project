@java.lang.Override
protected void initialize() {
    double currentYaw = navigationSubsystem.getYaw();
    double desiredYaw = currentYaw + (degree);
    if (desiredYaw > 180) {
        desiredYaw = desiredYaw - 360;
    }else
        if (desiredYaw < (-180)) {
            desiredYaw = desiredYaw + 360;
        }
    
    java.lang.System.out.println(((("C: " + currentYaw) + " D: ") + desiredYaw));
    pidController.setSetpoint(desiredYaw);
    pidController.enable();
}