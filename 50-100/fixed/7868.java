@java.lang.Override
public java.lang.Object getMessageBlocking(long timeDuration, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
    FinalProject.communication.CommTuple receivedCommTuple = receivedObjectQueue.poll(timeDuration, timeUnit);
    if (receivedCommTuple == null)
        return null;
    
    replyConnection = receivedCommTuple.getConnection();
    return receivedCommTuple.getObj();
}