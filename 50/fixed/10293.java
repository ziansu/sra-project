protected static synchronized void startShakeListener() {
    com.jackwink.tweakable.Tweakable.mOnShakeEnabled = true;
    com.jackwink.tweakable.Tweakable.mShakeDetector.start(com.jackwink.tweakable.Tweakable.mSensorManager);
}