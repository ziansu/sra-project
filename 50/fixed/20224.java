public double getDistance() {
    volts = AnalogPin.getVoltage();
    return (volts) * 10.0;
}