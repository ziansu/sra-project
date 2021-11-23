public final void run() {
    synchronized(this) {
        if ((status) != (org.bukkit.craftbukkit.util.Waitable.Status.WAITING)) {
            throw new java.lang.IllegalStateException(("Invalid state " + (status)));
        }
        status = org.bukkit.craftbukkit.util.Waitable.Status.RUNNING;
        try {
            value = evaluate();
        } catch (java.lang.Throwable t) {
            this.t = t;
        } finally {
            status = org.bukkit.craftbukkit.util.Waitable.Status.FINISHED;
            this.notifyAll();
        }
    }
}