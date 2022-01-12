protected void onPinCodeSuccess() {
    onPinSuccess(mAttempts);
    mAttempts = 0;
    mLockManager.getAppLock().setPasswordVerified(true);
}