private java.lang.Runnable getTaskFromSharedQueue() {
    synchronized(tasks) {
        while ((tasks.isEmpty()) && (alive.get())) {
            try {
                tasks.wait();
            } catch (java.lang.InterruptedException e) {
            }
        } 
        if (!(alive.get())) {
            return null;
        }
        return tasks.removeFirst();
    }
}