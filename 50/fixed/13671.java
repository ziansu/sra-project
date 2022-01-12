public void waitUntilMessagesQueueConsumed() {
    if ((queueConsumerThread) != null)
        queueConsumerThread.waitUntilEndOfQueue();
    
}