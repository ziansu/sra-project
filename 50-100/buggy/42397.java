@java.lang.Override
public void dependentStopped() {
    assert !(java.lang.Thread.holdsLock(this));
    final org.jboss.msc.service.ServiceControllerImpl<?> instance;
    final java.util.ArrayList<java.lang.Runnable> tasks;
    synchronized(this) {
        instance = this.instance;
        if (instance == null) {
            return ;
        }
        synchronized(instance) {
            tasks = instance.dependentStopped();
        }
    }
    instance.doExecute(tasks);
}