public T removeLast() {
    if ((size) == 0) {
        throw new java.util.NoSuchElementException();
    }
    T ans = data[end];
    (size)--;
    if ((end) == ((data.length) - 1)) {
        end = 0;
    }else {
        (end)--;
    }
    (size)--;
    return ans;
}