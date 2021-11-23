public boolean contains(int value) {
    for (int i : data) {
        if (i == value) {
            return true;
        }
    }
    return false;
}