@java.lang.Override
public void seekApplyOp(org.apache.accumulo.core.data.Range range, java.util.Collection<org.apache.accumulo.core.data.ByteSequence> columnFamilies, boolean inclusive) throws java.io.IOException {
    if (range.isInfiniteStartKey())
        seekStartKey = new org.apache.accumulo.core.data.Key();
    else
        seekStartKey = (range.isStartKeyInclusive()) ? range.getStartKey() : range.getStartKey().followingKey(PartialKey.ROW_COLFAM_COLQUAL);
    
}