private static boolean checkPreemption() {
    if (((Project1.currentProcess) == null) || (Project1.queue.isEmpty()))
        return false;
    
    switch (Project1.currentAlg) {
        case FCFS :
            return false;
        case SRT :
            return (Project1.queue.peek().getRemainingCPUTime()) < (Project1.currentProcess.getRemainingCPUTime());
        case RR :
            return ((Project1.timesliceRemaining) == (Project1.timesliceMax)) && (!(Project1.queue.isEmpty()));
    }
    return false;
}