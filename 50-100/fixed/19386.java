protected void handleScreenTurnedOff(int arg1) {
    clearFingerprintRecognized();
    final int count = mCallbacks.size();
    for (int i = 0; i < count; i++) {
        com.android.keyguard.KeyguardUpdateMonitorCallback cb = mCallbacks.get(i).get();
        if (cb != null) {
            cb.onScreenTurnedOff(arg1);
        }
    }
}