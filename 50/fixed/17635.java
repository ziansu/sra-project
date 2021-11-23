public void setAtPosition(long position, long value) {
    ensure(position);
    com.heerbann.unsafe.UnsafeBuffer.unsafe.putLong(((pointer) + position), value);
}