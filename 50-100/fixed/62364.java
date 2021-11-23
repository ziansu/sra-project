public boolean increasePriority() {
    boolean intStatus = nachos.threads.Machine.interrupt().disable();
    nachos.threads.KThread thread = nachos.threads.KThread.currentThread();
    int priority = getPriority(thread);
    if (priority == (nachos.threads.PriorityScheduler.priorityMaximum))
        return false;
    
    setPriority(thread, (priority + 1));
    nachos.threads.Machine.interrupt().restore(intStatus);
    return true;
}