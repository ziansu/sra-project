@java.lang.Override
protected synchronized simpledb.buffer.AbstractBuffer chooseUnpinnedBuffer() {
    simpledb.buffer.AbstractBuffer b = _availBufPool.poll();
    if (_availBufPool.contains(b)) {
        java.lang.System.out.println("WTF2!?!");
    }
    return b;
}