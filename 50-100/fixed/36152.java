@java.lang.Override
public com.metamx.collections.bitmap.ImmutableBitmap apply(com.metamx.collections.bitmap.ImmutableBitmap bitmap) {
    if (!(bitmap.isEmpty())) {
        org.roaringbitmap.IntIterator iter = bitmap.iterator();
        int length = 0;
        while (iter.hasNext()) {
            length = iter.next();
        } 
        return AtomCubeAggregatorFactory.BITMAP_FACTORY.complement(bitmap, (length + 1));
    }else {
        return bitmap;
    }
}