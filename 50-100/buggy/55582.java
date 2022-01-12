@java.lang.Override
protected byte get(int pos) {
    int currentPos = 0;
    for (java.nio.ByteBuffer bb : this.availableBuffers) {
        if ((bb.remaining()) > (pos - currentPos)) {
            return bb.get((pos - currentPos));
        }else {
            currentPos += bb.remaining();
        }
    }
    return 0;
}