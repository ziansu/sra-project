@java.lang.Override
public int getInvalidCharger() {
    synchronized(mLock) {
        return mInvalidCharger;
    }
}