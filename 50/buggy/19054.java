public void queue(long id) {
    (queueStack)++;
    queue.add(((data.currentQueueIndex()) + (queueStack)), id);
    (queueCount)++;
    log();
}