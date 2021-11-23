public void setAtPosition(long position, char value) {
    ensure(position);
    com.heerbann.unsafe.UnsafeBuffer.unsafe.putChar(((pointer) + position), value);
}