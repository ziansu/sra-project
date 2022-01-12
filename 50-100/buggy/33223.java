private void parseLine0(char[] dataLine) {
    if (dataLine == null) {
        return ;
    }
    this.ect.setValue(com.sharkylabs.util.HexUtils.hexCharArrayToInt(dataLine, 2, 5));
    this.iat.setValue(com.sharkylabs.util.HexUtils.hexCharArrayToInt(dataLine, 6, 9));
    this.fuelPressure.setValue(com.sharkylabs.util.HexUtils.hexCharArrayToInt(dataLine, 12, 13));
    this.tps.setValue(com.sharkylabs.util.HexUtils.hexCharArrayToInt(dataLine, 14, 15));
}