@org.teavm.javascript.spi.Sync
@org.teavm.javascript.spi.Rename(value = "notify")
public final void notify0() {
    if (!(org.teavm.classlib.java.lang.TObject.holdsLock(this))) {
        throw new org.teavm.classlib.java.lang.TIllegalMonitorStateException();
    }
    org.teavm.classlib.java.lang.TThread thread = org.teavm.classlib.java.lang.TThread.currentThread();
    org.teavm.platform.PlatformQueue<org.teavm.classlib.java.lang.TObject.NotifyListener> listeners = monitor.notifyListeners;
    while (!(listeners.isEmpty())) {
        org.teavm.classlib.java.lang.TObject.NotifyListener listener = listeners.remove();
        if (!(listener.expired())) {
            org.teavm.platform.Platform.startThread(listener);
            break;
        }
    } 
    org.teavm.classlib.java.lang.TThread.setCurrentThread(thread);
}