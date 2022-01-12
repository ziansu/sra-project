public static void finish() {
    nachos.threads.Lib.debug(nachos.threads.KThread.dbgThread, ("Finishing thread: " + (nachos.threads.KThread.currentThread.toString())));
    nachos.threads.Machine.interrupt().disable();
    nachos.threads.Machine.autoGrader().finishingCurrentThread();
    nachos.threads.Lib.assertTrue(((nachos.threads.KThread.toBeDestroyed) == null));
    nachos.threads.KThread.toBeDestroyed = nachos.threads.KThread.currentThread;
    nachos.threads.KThread.currentThread.status = nachos.threads.KThread.statusFinished;
    nachos.threads.KThread.sleep();
}