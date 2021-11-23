T clear() {
    T result = (acquired) ? null : object;
    object = null;
    acquired = false;
    return result;
}