public boolean add(T item) {
    if (this._isArrayFull()) {
        return false;
    }
    this._bag[_count] = item;
    (this._count)++;
    return true;
}