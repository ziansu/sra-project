public byte[] array() {
    if (isReleased()) {
        throw new org.voovan.tools.Exception.MemoryReleasedException("ByteBufferChannel is released.");
    }
    lock.lock();
    try {
        byte[] temp = new byte[size()];
        unsafe.copyMemory(null, address, temp, sun.misc.Unsafe.ARRAY_BYTE_BASE_OFFSET, size());
        return temp;
    } finally {
        lock.unlock();
    }
}