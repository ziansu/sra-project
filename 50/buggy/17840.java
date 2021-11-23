public static boolean doesDeviceHaveSecuritySetup(org.apache.cordova.devicesecurity.Context context) {
    android.app.KeyguardManager keyguardManager = ((android.app.KeyguardManager) (context.getSystemService(Context.KEYGUARD_SERVICE)));
    return keyguardManager.isKeyguardSecure();
}