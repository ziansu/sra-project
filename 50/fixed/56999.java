public void trim() {
    com.heerbann.unsafe.UnsafeBuffer.unsafe.reallocateMemory(pointer, end);
    position = ((position) > (end)) ? end : position;
    capacity = end;
}