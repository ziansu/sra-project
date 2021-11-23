public void shrink(int newSize) {
    com.heerbann.unsafe.UnsafeBuffer.unsafe.reallocateMemory(pointer, newSize);
    position = 0;
    end = 0;
    capacity = newSize;
}