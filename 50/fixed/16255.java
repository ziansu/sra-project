public boolean exists(java.lang.String name) {
    synchronized(queues) {
        return queues.containsKey(name);
    }
}