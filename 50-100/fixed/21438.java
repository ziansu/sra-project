@java.lang.Override
public java.lang.String removeData() throws java.lang.InterruptedException {
    synchronized(getQueueData()) {
        if (getQueueData().isEmpty()) {
            getQueueData().wait();
        }else {
            java.lang.String toBeRemoved = getQueueData().get(((getQueueData().size()) - 1));
            getQueueData().remove(toBeRemoved);
            return toBeRemoved;
        }
        return null;
    }
}