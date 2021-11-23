@java.lang.Override
public int moveToFirst() {
    return (set.nextSetBit(0)) + (offset);
}