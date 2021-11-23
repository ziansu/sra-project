private synchronized void occupyFork(com.epam.lab.philosophers.synch.Fork fork) {
    synchronized(fork) {
        while (fork.isOccupied()) {
            java.lang.System.out.println((("Philosopher (" + (this.id)) + ") is thinking"));
            try {
                this.wait(com.epam.lab.philosophers.synch.Philosopher.TIMEOUT);
            } catch (java.lang.InterruptedException e) {
                e.printStackTrace();
            } finally {
                greaterForkId.release();
                smallerForkId.release();
            }
        } 
        fork.occupy(this.id);
    }
}