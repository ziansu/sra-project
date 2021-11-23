private void addItemsToQueue() {
    for (int i = 0; i < (_numIterations); i++) {
        java.lang.String message = (("Producer # " + (_id)) + " message # ") + i;
        _queue.AddToQueue(message);
        nachos.threads.KThread.yield();
    }
    _listener.ProducerComplete();
}