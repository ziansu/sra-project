@java.lang.Override
public int countBeforeFull() {
    return (info.getPrefetchSize()) - (getDispatchedQueueSize());
}