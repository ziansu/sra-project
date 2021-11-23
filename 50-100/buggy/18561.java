private int getResolvedLongPressOnPowerBehavior() {
    if (android.os.FactoryTest.isLongPressOnPowerOffEnabled()) {
        return com.android.server.policy.PhoneWindowManager.LONG_PRESS_POWER_SHUT_OFF_NO_CONFIRM;
    }
    if ((mTorchLongPressPowerEnabled) && (!(isScreenOn()))) {
        return com.android.server.policy.PhoneWindowManager.LONG_PRESS_POWER_TORCH;
    }
    if (mPocketLockShowing) {
        return com.android.server.policy.PhoneWindowManager.LONG_PRESS_POWER_HIDE_POCKET_LOCK;
    }
    return mLongPressOnPowerBehavior;
}