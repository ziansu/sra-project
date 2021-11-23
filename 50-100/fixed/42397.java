@java.lang.Override
public void dependentStopped() {
    assert !(java.lang.Thread.holdsLock(this));
    final org.jboss.msc.service.ServiceControllerImpl<?> instance;
    synchronized(this) {
        instance = this.instance;
    }
    if (instance != null) {
        instance.dependentStopped();
    }
}