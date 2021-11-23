@java.lang.Override
public void onAttachedToWindow() {
    accelerated.set(isHardwareAccelerated());
    listenerCalled.notifyCalled();
}