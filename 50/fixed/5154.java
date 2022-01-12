public T poll() {
    if ((_data.size()) == 0) {
        return null;
    }
    return _data.remove(((_data.size()) - 1));
}