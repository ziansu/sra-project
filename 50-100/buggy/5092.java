public java.lang.String parseGetDeviceIp(java.lang.String ipInfo) {
    if ((ipInfo.isEmpty()) || (ipInfo.contains(com.github.pedrovgs.androidwifiadb.adb.ADBParser.ERROR_PARSING_DEVICE_IP_KEY))) {
        return "";
    }
    java.lang.String[] splittedOutput = ipInfo.split("\\n");
    int end = splittedOutput[1].indexOf(com.github.pedrovgs.androidwifiadb.adb.ADBParser.END_DEVICE_IP_INDICATOR);
    int start = (splittedOutput[1].indexOf(com.github.pedrovgs.androidwifiadb.adb.ADBParser.START_DEVICE_IP_INDICATOR)) + 5;
    return splittedOutput[1].substring(start, end);
}