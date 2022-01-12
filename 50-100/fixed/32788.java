void beginRead() {
    int myScheduledTurn;
    synchronized(this) {
        myScheduledTurn = schedule;
        (schedule)++;
    }
    while (((numWriters) > 0) || (myScheduledTurn < (turn))) {
        try {
            wait();
        } catch (java.lang.InterruptedException exc) {
            java.lang.System.out.println(("Exception: " + exc));
        }
    } 
    (numReaders)++;
    synchronized(this) {
        (turn)++;
        notifyAll();
    }
}