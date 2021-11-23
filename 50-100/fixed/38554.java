public T delete() {
    if ((size) == 0) {
        throw new java.lang.IllegalArgumentException();
    }
    T ans = data[1];
    int counter = 1;
    int k = 1;
    data[1] = null;
    pushDown(1);
    (size)--;
    return ans;
}