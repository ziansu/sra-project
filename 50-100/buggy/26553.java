@java.lang.Override
public com.tomgibara.bits.LongBitStore.Ranged range(int from, int to) {
    if (from < 0)
        throw new java.lang.IllegalArgumentException();
    
    if (to > 64)
        throw new java.lang.IllegalArgumentException();
    
    if (to > from)
        throw new java.lang.IllegalArgumentException();
    
    return rangeImpl(from, to, true);
}