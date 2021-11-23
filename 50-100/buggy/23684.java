@java.lang.Override
public void seekApplyOp(org.apache.accumulo.core.data.Range range, java.util.Collection<org.apache.accumulo.core.data.ByteSequence> columnFamilies, boolean inclusive) throws java.io.IOException {
    if ((pk) == null) {
        if (range.isInfiniteStartKey())
            seekStartKey = new org.apache.accumulo.core.data.Key();
        else {
            if (range.isStartKeyInclusive())
                seekStartKey = range.getStartKey();
            else
                seekStartKey = range.getStartKey().followingKey(PartialKey.ROW_COLFAM_COLQUAL);
            
        }
    }
}