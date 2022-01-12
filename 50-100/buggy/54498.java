@java.lang.Override
public boolean isFinished() {
    long now = java.lang.System.currentTimeMillis();
    long elapsed = now - (getStartTime());
    boolean result = false;
    if (elapsed >= (java.lang.Math.abs(getTime()))) {
        result = true;
    }
    return false;
}