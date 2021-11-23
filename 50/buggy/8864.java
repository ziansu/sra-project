@java.lang.Override
protected void initialize() {
    motor.reset();
    motor.enableMC();
    motor.setPosition(position);
    org.usfirst.frc4904.standard.LogKitten.wtf("INIT");
}