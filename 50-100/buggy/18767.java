@java.lang.Override
public void run() {
    synchronized(this) {
        if ((org.bukkit.craftbukkit.scheduler.CraftFuture.getPeriod()) == (-2L)) {
            return ;
        }
        org.bukkit.craftbukkit.scheduler.CraftFuture.setPeriod((-3L));
    }
    try {
        value = callable.call();
    } catch (final java.lang.Exception e) {
        exception = e;
    } finally {
        synchronized(this) {
            org.bukkit.craftbukkit.scheduler.CraftFuture.setPeriod((-4L));
            this.notifyAll();
        }
    }
}