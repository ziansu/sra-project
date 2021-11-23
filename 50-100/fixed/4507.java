@java.lang.Override
public long getBits(int position, int length) {
    if (position < 0)
        throw new java.lang.IllegalArgumentException();
    
    if ((position + length) > 64)
        throw new java.lang.IllegalArgumentException();
    
    switch (length) {
        case 0 :
            return 0;
        case 64 :
            return bits;
        default :
            return ((bits) >> position) & (~((-1L) << length));
    }
}