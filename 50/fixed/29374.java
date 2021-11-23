public void setAtPosition(long position, short value) {
    ensure(position);
    com.heerbann.unsafe.UnsafeBuffer.unsafe.putShort(((pointer) + position), value);
}