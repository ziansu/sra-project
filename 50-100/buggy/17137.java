private static void partHashSet(final java.util.BitSet dst, final int dstOffset, final java.util.BitSet src, final int srcLen) {
    assert (dstOffset + (dst.size())) <= srcLen;
    for (int i = 0; i < (java.lang.Math.min(src.size(), srcLen)); ++i)
        dst.set((dstOffset + i), src.get(i));
    
}