private boolean goodToRaiseVoltage() {
    return (mVoltage) < (Properties2016.sMAX_HARVESTER_POT_VOLTAGE.getValue());
}