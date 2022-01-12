@java.lang.Override
public int getSID(int gid) {
    if (gid == 0) {
        return 0;
    }
    int count = 0;
    for (net.java.dev.typecast.ot.table.CffTable.CharsetRange range : _charsetRanges) {
        if (gid < ((range.getLeft()) + count)) {
            int sid = ((gid - count) + (range.getFirst())) - 1;
            return sid;
        }
        count += range.getLeft();
    }
    return 0;
}