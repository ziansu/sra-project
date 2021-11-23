void destroy() {
    for (org.glassfish.grizzly.Connection c : queue) {
        c.close();
    }
    queue.clear();
    queues.remove(this);
}