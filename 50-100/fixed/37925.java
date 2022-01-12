public static void sendCommand(java.lang.String lircCommand, java.lang.String lircName) {
    me.codewonderland.aceautomation.LIRCManager.runBashCommands(java.util.Arrays.asList(java.util.Arrays.asList("sudo", "/etc/init.d/lirc", "start"), java.util.Arrays.asList("irsend", "SEND_ONCE", lircName, lircCommand), java.util.Arrays.asList("sudo", "/etc/init.d/lirc", "stop")));
}