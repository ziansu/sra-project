public T delete() {
    if ((size) == 0) {
        throw new java.util.NoSuchElementException();
    }
    T ans = data[1];
    data[1] = data[size];
    data[size] = null;
    (size)--;
    pushDown(1);
    return ans;
}