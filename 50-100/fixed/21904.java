public void join() {
    nachos.threads.Lib.debug(nachos.threads.KThread.dbgThread, ("Joining to thread: " + (toString())));
    nachos.threads.Lib.assertTrue(((this) != (nachos.threads.KThread.currentThread)));
    if ((status) == (nachos.threads.KThread.statusFinished)) {
        return ;
    }else {
        nachos.threads.Machine.interrupt().disable();
        this.joinQueue.waitForAccess(nachos.threads.KThread.currentThread);
        nachos.threads.KThread.currentThread.sleep();
        nachos.threads.Machine.interrupt().enable();
    }
}