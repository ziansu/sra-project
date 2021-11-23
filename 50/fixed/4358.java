synchronized void unpin(simpledb.buffer.Buffer buff) {
    buff.unpin();
    if (!(buff.isPinned()))
        (numAvailable)++;
    
}