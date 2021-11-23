private boolean nextBuffer() throws java.io.IOException {
    if ((currentIndex) < (maxIndex)) {
        (currentIndex)++;
        switchBuffer(currentIndex, false);
        return true;
    }
    return false;
}