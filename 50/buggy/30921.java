@java.lang.Override
synchronized simpledb.buffer.AbstractBuffer pinNew(java.lang.String filename, simpledb.buffer.PageFormatter fmtr) {
    simpledb.buffer.AbstractBuffer buff = super.pinNew(filename, fmtr);
    _allocatedBufMap.put(buff.block(), buff);
    return buff;
}