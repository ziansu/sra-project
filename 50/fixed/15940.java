public synchronized boolean isEmpty(org.scribble.sesstype.name.Role peer) {
    return this.queues.get(peer).isEmpty();
}