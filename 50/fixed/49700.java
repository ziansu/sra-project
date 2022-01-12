@java.lang.Override
public boolean getBatteryLevelLow() {
    synchronized(mLock) {
        return false;
    }
}