public static final void initialize(android.content.Context context) {
    if ((Build.VERSION.SDK_INT) < (Build.VERSION_CODES.JELLY_BEAN_MR2)) {
        return ;
    }
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.M)) {
        com.mtramin.rxfingerprint.AndroidFingerprintModule module = com.mtramin.rxfingerprint.AndroidFingerprintModule.getInstance();
        if (module.isHardwareDetected(context)) {
            com.mtramin.rxfingerprint.RxFingerprint.fingerprintModule = module;
        }
    }
    if ((com.mtramin.rxfingerprint.RxFingerprint.fingerprintModule) == null) {
        com.mtramin.rxfingerprint.PassFingerprintModule module = com.mtramin.rxfingerprint.PassFingerprintModule.getInstance(context);
        if (module.isHardwareDetected(context)) {
            com.mtramin.rxfingerprint.RxFingerprint.fingerprintModule = module;
        }
    }
}