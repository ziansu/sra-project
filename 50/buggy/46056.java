private void parseLine1(char[] dataLine) {
    if (dataLine == null) {
        return ;
    }
    this.rpm.setValue(com.sharkylabs.util.HexUtils.hexCharArrayToInt(dataLine, 6, 9));
}