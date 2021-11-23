private void parseLine1() {
    this.rpm.setValue(com.sharkylabs.util.HexUtils.hexCharArrayToInt(this.buffer[1], 6, 9));
}