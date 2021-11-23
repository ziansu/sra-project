@java.lang.Override
public int previous(int position) {
    com.tomgibara.bits.LongBitStore.checkPosition(position);
    if (position == 0)
        return -1;
    
    long value = (~(bits)) << (64 - position);
    return value == 0L ? -1 : (position - 1) - (java.lang.Long.numberOfLeadingZeros(value));
}