private boolean nextBuffer() throws java.io.IOException {
    if ((currentIndex) < (maxIndex)) {
        switchBuffer(((currentIndex) + 1));
        return true;
    }
    return false;
}