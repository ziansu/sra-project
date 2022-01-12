public void setAtPosition(long position, double value) {
    ensure(position);
    com.heerbann.unsafe.UnsafeBuffer.unsafe.putDouble(((pointer) + position), value);
}