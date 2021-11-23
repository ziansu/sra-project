@java.lang.Override
public boolean onPrepareToPulse() {
    mLogoController.hideAndLock(mPulseOnListener);
    if (mLogoController.isEnabled()) {
        return true;
    }
    return false;
}