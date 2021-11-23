@java.lang.Override
public void publish(com.barthezzko.playergame.model.Message msg) {
    if (logger.isDebugEnabled()) {
        logger.debug(("PUB:" + msg));
    }
    java.lang.Object lockObject = lockMap.get(msg.getReceiver());
    synchronized(lockObject) {
        addMessage(msg);
        currentMsg.set(msg);
        lockObject.notify();
    }
}