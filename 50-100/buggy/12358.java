private java.lang.Runnable getTaskFromSharedQueue() {
    synchronized(tasks) {
        while ((tasks.isEmpty()) && (alive)) {
            try {
                tasks.wait();
            } catch (java.lang.InterruptedException e) {
            }
        } 
        if (!(alive)) {
            return null;
        }
        return tasks.removeFirst();
    }
}