private nachos.threads.PriorityScheduler.ThreadState getThreadState(nachos.threads.KThread thread) {
    if (thread == null) {
        return null;
    }
    if ((thread.schedulingState) == null)
        thread.schedulingState = new nachos.threads.PriorityScheduler.ThreadState(thread);
    
    return ((nachos.threads.PriorityScheduler.ThreadState) (thread.schedulingState));
}