public static boolean isSupported() {
    return org.cyanogenmod.internal.util.FileUtils.isFileWritable(org.cyanogenmod.hardware.DisplayColorCalibration.COLOR_FILE);
}