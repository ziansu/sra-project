@java.lang.Override
public int previous(int position) {
    int p = adjPosition(position);
    if (p == (start))
        return -1;
    
    long value = ((bits) & (mask)) << (64 - p);
    return value == 0L ? -1 : (position - 1) + (java.lang.Long.numberOfLeadingZeros(value));
}