private static void swLock() {
    if (org.jikesrvm.VM.sysWriteLockOffset.isMax())
        return ;
    
    while (!(org.jikesrvm.scheduler.Synchronization.testAndSet(org.jikesrvm.runtime.Magic.getJTOC(), org.jikesrvm.VM.sysWriteLockOffset, 1))) {
    } 
}