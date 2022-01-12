private void parseLine0() {
    this.ect.setValue(com.sharkylabs.util.HexUtils.hexCharArrayToInt(this.buffer[0], 2, 5));
    this.iat.setValue(com.sharkylabs.util.HexUtils.hexCharArrayToInt(this.buffer[0], 6, 9));
    this.fuelPressure.setValue(com.sharkylabs.util.HexUtils.hexCharArrayToInt(this.buffer[0], 12, 13));
    this.tps.setValue(com.sharkylabs.util.HexUtils.hexCharArrayToInt(this.buffer[0], 14, 15));
}