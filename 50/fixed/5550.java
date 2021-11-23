public void setAtPosition(long position, float value) {
    ensure(position);
    com.heerbann.unsafe.UnsafeBuffer.unsafe.putFloat(((pointer) + position), value);
}