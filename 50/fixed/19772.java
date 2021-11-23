T clear() {
    T result = (acquired) ? null : object;
    set(null);
    acquired = false;
    return result;
}