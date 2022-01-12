@java.lang.Override
public int size(int partitionNo) {
    if (partitionNo > 0) {
        throw new java.lang.IllegalArgumentException((("Invalid Partition Number " + partitionNo) + " specified."));
    }
    int sz = ((int) ((writeSequence.get()) - (readSequence.get())));
    return sz > (buffer.length) ? buffer.length : sz;
}