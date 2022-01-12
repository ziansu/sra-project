public boolean tryLock(long time, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException {
    java.lang.Boolean retval = ((java.lang.Boolean) (ch.down(new org.jgroups.Event(org.jgroups.Event.LOCK, new org.jgroups.blocks.locking.LockInfo(name, true, true, true, time, unit)))));
    if (java.lang.Thread.currentThread().isInterrupted())
        throw new java.lang.InterruptedException();
    
    if ((retval != null) && retval)
        holder.set(java.lang.Thread.currentThread());
    
    return retval == null ? false : retval;
}