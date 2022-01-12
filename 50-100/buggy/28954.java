@java.lang.Override
public java.lang.String removeData() throws java.lang.InterruptedException {
    synchronized(getQueueData()) {
        if (getQueueData().isEmpty()) {
            getQueueData().wait();
        }
        java.lang.String toBeRemoved = getQueueData().get(0);
        getQueueData().remove(toBeRemoved);
        return toBeRemoved;
    }
}