public static java.lang.String getVenderCommand(java.lang.String cmd) {
    java.lang.String cmdString = cmd.replaceAll("\\s*", "");
    return ((("AA" + cmdString) + (java.lang.Integer.toHexString(com.seekersoftvendingapp.serialport.VendingSerialPort.getBCC(cmdString)))) + "AC").toUpperCase();
}