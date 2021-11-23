@java.lang.Override
public java.lang.Object get(int i) throws hp.queueset.EmptyQueueSetException {
    if ((i > (count)) || (i < 0)) {
        throw new hp.queueset.QueueSetIndexOutOfBoundsException();
    }else {
        return elements[i];
    }
}