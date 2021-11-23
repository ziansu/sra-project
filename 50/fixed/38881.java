public void waitPathfinding() throws exceptions.PathfindingException, java.lang.InterruptedException {
    synchronized(inst) {
        while (!(inst.isDone()))
            inst.wait();
        
        inst.throwException();
    }
}