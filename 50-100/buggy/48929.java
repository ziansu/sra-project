public void start() {
    int sjf = 1;
    int rr = 1;
    while ((interruptCounter) > 0) {
        isTaskArrived();
        while (sjf != 0)
            sjf = firstLevelSch.runTask();
        
        (MainScheduler.counter)++;
        isTaskArrived();
        rr = secondLevelSch.runTask();
        (MainScheduler.counter)++;
        if ((sjf == 0) && (rr == 0))
            (interruptCounter)--;
        
    } 
    stop();
}