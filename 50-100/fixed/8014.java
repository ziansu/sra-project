private void addItemsToQueue() {
    for (int i = 0; i < (_numIterations); i++) {
        java.lang.String message = (("Producer # " + (_id)) + " message # ") + i;
        if ((i + 1) == (_numIterations)) {
            _queue.AddToQueue(message, _listener);
        }else {
            _queue.AddToQueue(message);
        }
        nachos.threads.KThread.yield();
    }
}