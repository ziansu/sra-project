@java.lang.Override
public void putShort(final long offsetBytes, final short value) {
    checkValid();
    com.yahoo.memory.UnsafeUtil.assertBounds(offsetBytes, com.yahoo.memory.UnsafeUtil.ARRAY_SHORT_INDEX_SCALE, capacity);
    com.yahoo.memory.UnsafeUtil.unsafe.putLong(unsafeObj, ((cumBaseOffset) + offsetBytes), value);
}