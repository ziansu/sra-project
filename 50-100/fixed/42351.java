public int getEffectivePriority() {
    if (!(transferPriority))
        return 0;
    
    if (changed) {
        int m = 0;
        for (java.util.Iterator<nachos.threads.PriorityScheduler.ThreadState> it = waitingQueue.iterator(); it.hasNext();) {
            nachos.threads.PriorityScheduler.ThreadState t = it.next();
            int n = t.getEffectivePriority();
            if (n > m)
                m = n;
            
        }
        this.effectivePriority = m;
        changed = false;
    }
    return effectivePriority;
}