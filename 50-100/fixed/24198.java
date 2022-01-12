@java.lang.Override
public void run() {
    currentMessages = get(org.apache.flume.source.taildirectory.DirectoryTailSourceCounter.COUNTER_MESSAGE_SENT);
    if ((currentMessages) >= (previousMessages)) {
        currentThroughput = (currentMessages) - (previousMessages);
        set(org.apache.flume.source.taildirectory.DirectoryTailSourceCounter.CURRENT_THROUGHPUT, currentThroughput);
        currentTime = (java.lang.System.currentTimeMillis()) / 1000;
        if ((currentTime) > (startTime)) {
            averageThroughput = (currentMessages) / ((currentTime) - (startTime));
        }
        set(org.apache.flume.source.taildirectory.DirectoryTailSourceCounter.AVERAGE_THROUGHPUT, averageThroughput);
        previousMessages = currentMessages;
    }
}