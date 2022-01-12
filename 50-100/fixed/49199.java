@java.lang.Override
public void illuminance(int illuminance) {
    org.synyx.sybil.in.IlluminanceListener.LOG.debug("Lux: {}", (illuminance / 10));
    double brightness = 1.0;
    if (illuminance < ((threshold) * 10)) {
        brightness += (((threshold) * 10) - illuminance) * (multiplier);
    }
    for (org.synyx.sybil.out.OutputLEDStrip ledStrip : ledStrips) {
        if (brightness != (ledStrip.getBrightness())) {
            ledStrip.setBrightness(brightness);
            ledStrip.updateDisplay();
        }
    }
}