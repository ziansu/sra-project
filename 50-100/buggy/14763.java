public T removeLast() {
    if ((size) == 0) {
        throw new java.util.NoSuchElementException();
    }
    T ans = data[end];
    (size)--;
    if ((end) == 0) {
        end = data.length;
    }
    (end)--;
    return ans;
}