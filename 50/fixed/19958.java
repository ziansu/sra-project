public boolean resizeDisk(long newSize) {
    java.lang.System.out.println(newSize);
    java.lang.System.out.println(currSize);
    if (newSize < (currSize)) {
        return false;
    }
    maxSize = newSize;
    java.lang.System.out.println(maxSize);
    return true;
}