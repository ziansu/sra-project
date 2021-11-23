@java.lang.Override
public long getSizeInBytes() {
    if ((sizeInBytes) < 0) {
        calculateSize();
    }
    return sizeInBytes;
}