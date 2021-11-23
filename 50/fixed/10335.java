public boolean isFull() {
    if ((list.size()) != ((capacity) - 1)) {
        return false;
    }
    return true;
}