private void initBufWithSubpage(io.mycat.bigmem.buffer.BaseByteBuffer<T> byteBuffer, long handle, int bitmapIdx, int capacity) {
    bitmapIdx = bitmapIdx & 1073741823;
    int memoryMapIdx = ((int) (handle));
    io.mycat.bigmem.buffer.Subpage<T> subpage = subpagesList[subpageId(memoryMapIdx)];
    byteBuffer.init(this, handle, ((runOffset(memoryMapIdx)) + (bitmapIdx * (subpage.getElememtSize()))), capacity);
}