private static boolean hasVibratorIntensity(android.content.Context context) {
    android.hardware.CmHardwareManager cmHardwareManager = ((android.hardware.CmHardwareManager) (context.getSystemService(Context.CMHW_SERVICE)));
    if (!(cmHardwareManager.isSupported(CmHardwareManager.FEATURE_VIBRATOR))) {
        return false;
    }
    return true;
}