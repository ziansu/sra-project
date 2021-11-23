void free(final long id) throws java.io.IOException {
    final net.kotek.jdbm.BlockIo curBlock = file.get(net.kotek.jdbm.Location.getBlock(id));
    final short offset = net.kotek.jdbm.Location.getOffset(id);
    final int size = net.kotek.jdbm.RecordHeader.getAvailableSize(curBlock, offset);
    if (size > (net.kotek.jdbm.PhysicalRowIdManager.DATA_PER_PAGE)) {
    }
    net.kotek.jdbm.RecordHeader.setCurrentSize(curBlock, offset, 0);
    file.release(curBlock);
    freeman.put(id, size);
}