private void post(java.lang.String message) {
    messages.add(message);
    int id = datacenter.AppServer.nodeId;
    int currentTime = clock.getAndIncrement();
    api.Operation post = new api.PostOperation(message);
    datacenter.Event e = new datacenter.Event(post, currentTime, id);
    log.add(e);
    timeTable[(id - 1)][(id - 1)] = currentTime;
}