private static void showDeviceInfo(jlibfprint.Device device) {
    java.lang.System.out.println("=====================================");
    java.lang.System.out.println(("Device: " + device));
    java.lang.System.out.println(("\tNumber of enroll stages: " + (device.getNumberEnrollStages())));
    java.lang.System.out.println(("\tImage width: " + (device.getImageWidth())));
    java.lang.System.out.println(("\tImage height: " + (device.getImageHeight())));
    java.lang.System.out.println("=====================================");
}