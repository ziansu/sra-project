public boolean tryLock() {
    java.lang.Boolean retval = ((java.lang.Boolean) (ch.down(new org.jgroups.Event(org.jgroups.Event.LOCK, new org.jgroups.blocks.locking.LockInfo(name, true, false, false, 0, java.util.concurrent.TimeUnit.MILLISECONDS)))));
    if ((retval != null) && retval)
        holder.set(java.lang.Thread.currentThread());
    
    return retval;
}