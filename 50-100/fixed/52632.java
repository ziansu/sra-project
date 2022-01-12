@java.lang.Override
public org.apache.accumulo.core.data.Key getTopKey() {
    if (source.hasTop())
        return lastSafeKey;
    else {
        org.apache.accumulo.core.data.Key sk = lastSafeKey.followingKey(PartialKey.ROW_COLFAM_COLQUAL);
        return new org.apache.accumulo.core.data.Key(sk.getRow(), sk.getColumnFamily(), sk.getColumnQualifier(), lastSafeKey.getColumnVisibility());
    }
}