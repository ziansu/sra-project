protected static void startShakeListener() {
    if (com.jackwink.tweakable.Tweakable.mOnShakeEnabled) {
        com.jackwink.tweakable.Tweakable.mShakeDetector.start(com.jackwink.tweakable.Tweakable.mSensorManager);
    }
}