@java.lang.Override
public void run() {
    emulateKeyPress(mKeyCodes);
    if (mRepeating) {
        mTeclaHandler.postDelayed(mRepeatKeyRunnable, java.lang.Math.round((0.5 * (TeclaApp.persistence.getScanDelay()))));
    }else {
        mTeclaHandler.postDelayed(mRepeatKeyRunnable, TeclaApp.persistence.getScanDelay());
        mRepeating = true;
    }
}