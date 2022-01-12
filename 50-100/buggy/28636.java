@java.lang.Override
public int previous(int position) {
    com.tomgibara.bits.LongBitStore.checkPosition(position);
    long value = (bits) << (64 - position);
    return value == 0L ? -1 : (position - 1) - (java.lang.Long.numberOfLeadingZeros(value));
}