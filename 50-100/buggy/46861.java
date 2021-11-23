public T get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
    synchronized(status) {
        while ((status) != (org.bukkit.craftbukkit.util.Waitable.Status.FINISHED)) {
            this.wait();
        } 
    }
    if ((t) != null) {
        throw new java.util.concurrent.ExecutionException(t);
    }
    return value;
}