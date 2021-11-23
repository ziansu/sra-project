@java.lang.Override
public int getSID(int gid) {
    if (gid == 0) {
        return 0;
    }
    int count = 0;
    for (net.java.dev.typecast.ot.table.CffTable.CharsetRange range : _charsetRanges) {
        count += range.getLeft();
        if (gid < count) {
            int sid = (gid - count) + (range.getFirst());
            return sid;
        }
    }
    return 0;
}