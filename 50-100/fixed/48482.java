public T remove() {
    if (this.isEmpty()) {
        return null;
    }
    T item = this._bag[((this._count) - 1)];
    this._bag[_count] = null;
    (this._count)--;
    return item;
}