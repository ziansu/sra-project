private void close0() {
    closeColumns(true);
    com.questdb.cairo.Misc.free(txMem);
    com.questdb.cairo.Misc.free(metaMem);
    com.questdb.cairo.Misc.free(columnSizeMem);
    com.questdb.cairo.Misc.free(path);
}