void assignToBlock(simpledb.buffer.Block b) {
    flush();
    blk = b;
    contents.read(blk);
    pins = 0;
}