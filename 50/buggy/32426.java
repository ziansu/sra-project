public void shrink(int newSize) {
    com.heerbann.unsafe.UnsafeBuffer.unsafe.reallocateMemory(pointer, newSize);
    position = ((position) > newSize) ? newSize : position;
    capacity = newSize;
}