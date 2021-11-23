public java.lang.String parseGetDeviceIp(java.lang.String ipInfo) {
    if ((ipInfo.isEmpty()) || (ipInfo.contains(com.github.pedrovgs.androidwifiadb.adb.ADBParser.ERROR_PARSING_DEVICE_IP_KEY))) {
        return "";
    }
    int end = ipInfo.indexOf(com.github.pedrovgs.androidwifiadb.adb.ADBParser.END_DEVICE_IP_INDICATOR);
    int start = (ipInfo.indexOf(com.github.pedrovgs.androidwifiadb.adb.ADBParser.START_DEVICE_IP_INDICATOR)) + 5;
    return ipInfo.substring(start, end);
}