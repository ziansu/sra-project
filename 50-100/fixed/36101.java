public void join() {
    nachos.threads.Lib.debug(nachos.threads.KThread.dbgThread, ("Joining to thread: " + (toString())));
    nachos.threads.Lib.assertTrue(((this) != (nachos.threads.KThread.currentThread)));
    nachos.threads.Machine.interrupt().disable();
    nachos.threads.KThread thread = nachos.threads.KThread.currentThread;
    thread.sleep();
    nachos.threads.KThread.currentThread = this;
    nachos.threads.KThread.currentThread.run();
    nachos.threads.KThread.currentThread = thread;
    nachos.threads.KThread.currentThread.ready();
    nachos.threads.Machine.interrupt().enable();
}