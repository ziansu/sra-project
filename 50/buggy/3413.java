@java.lang.Override
public void setTTYMode(int ttyMode, android.os.Message onComplete) {
    super.setTTYMode(ttyMode, onComplete);
    mCT.setTtyMode(ttyMode);
}