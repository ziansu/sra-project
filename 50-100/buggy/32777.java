synchronized simpledb.buffer.Buffer pinNew(java.lang.String filename, simpledb.buffer.PageFormatter fmtr) {
    simpledb.buffer.Buffer buff = chooseUnpinnedBuffer();
    java.lang.System.out.println("pinNew");
    if (buff == null)
        return null;
    
    if ((buff.block()) != null) {
        bufferPoolMap.remove(buff.block());
    }
    buff.assignToNew(filename, fmtr);
    bufferPoolMap.put(buff.block(), buff);
    (numAvailable)--;
    buff.pin();
    return buff;
}