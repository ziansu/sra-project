@java.lang.Override
public java.lang.Object dequeue() throws hp.queueset.EmptyQueueSetException {
    if ((count) > 0) {
        java.lang.Object tmp = elements[0];
        for (int i = 0; i < ((count) - 1); i++) {
            elements[i] = elements[(i + 1)];
        }
        (count)--;
        return tmp;
    }else {
        throw new hp.queueset.EmptyQueueSetException();
    }
}