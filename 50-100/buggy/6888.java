public boolean isCallTime(int timeIndex) {
    return ((((double) (timeIndex + 1)) / (getProp(de.htw.berlin.polysun4diac.plugins.BatteryPreSimulatorSocket.CALL_INTERVAL_KEY).getInt())) - 1) == ((java.lang.Math.ceil((((double) (timeIndex + 1)) / (getProp(de.htw.berlin.polysun4diac.plugins.BatteryPreSimulatorSocket.CALL_INTERVAL_KEY).getInt())))) - 1);
}