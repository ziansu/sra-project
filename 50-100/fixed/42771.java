public T removeLast() {
    if ((data[end]) == null) {
        throw new java.util.NoSuchElementException();
    }
    T ans = data[end];
    data[end] = null;
    if ((end) == 0) {
        end = (data.length) - 1;
    }else {
        (end)--;
    }
    (size)--;
    return ans;
}