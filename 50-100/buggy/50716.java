private void parseLine3(java.lang.String dataLine) {
    if ((dataLine == null) || (dataLine.isEmpty())) {
        return ;
    }
    java.lang.String[] s = com.sharkylabs.ECMInfo.getDataTokens(dataLine);
    this.iac = new com.sharkylabs.pid.IAC(java.lang.Integer.decode(("0x" + (s[1]))));
}