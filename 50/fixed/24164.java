@java.lang.Override
public void setIsInterrupted(boolean enable) {
    this.isInterrupted = enable;
    if (!enable) {
        this.interruptValue = 0.0;
    }
}