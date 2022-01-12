@java.lang.Override
public java.lang.Object dequeue() throws hp.queueset.EmptyQueueSetException {
    java.lang.Object tmp = elements[0];
    if ((count) > 0) {
        for (int i = 1; i <= (count); i++) {
            elements[(i - 1)] = elements[i];
        }
        (count)--;
        return tmp;
    }else {
        throw new hp.queueset.EmptyQueueSetException();
    }
}