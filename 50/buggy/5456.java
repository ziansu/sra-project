private boolean goodToLowerVoltage() {
    return (mVoltage) > (Properties2016.sMIN_HARVESTER_POT_VOLTAGE.getValue());
}