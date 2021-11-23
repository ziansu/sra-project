public void setAtPosition(long position, double value) {
    long i = (pointer) + (position * (com.heerbann.unsafe.UnsafeBuffer.sizeOfDouble));
    ensure(i);
    com.heerbann.unsafe.UnsafeBuffer.unsafe.putDouble(i, value);
}