@java.lang.Override
public int countBeforeFull() {
    return (getDispatchedQueueSize()) - (info.getPrefetchSize());
}