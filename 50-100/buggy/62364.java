public boolean increasePriority() {
    boolean intStatus = nachos.threads.Machine.interrupt().disable();
    boolean ret = true;
    nachos.threads.KThread thread = nachos.threads.KThread.currentThread();
    int priority = getPriority(thread);
    if (priority == (nachos.threads.PriorityScheduler.priorityMaximum))
        ret = false;
    else
        setPriority(thread, (priority + 1));
    
    nachos.threads.Machine.interrupt().restore(intStatus);
    return ret;
}