@java.lang.Override
void processByte(byte[] data, int size) throws java.io.IOException {
    mFIS.write(data, 0, size);
}