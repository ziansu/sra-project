public static org.strongback.components.Motor victorSP(int channel, org.strongback.function.DoubleToDoubleFunction speedLimiter) {
    return new org.strongback.hardware.HardwareMotor(new edu.wpi.first.wpilibj.VictorSP(channel), org.strongback.hardware.Hardware.Motors.SPEED_LIMITER);
}