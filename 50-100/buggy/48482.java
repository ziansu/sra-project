public T remove() {
    if (this.isEmpty()) {
        return null;
    }
    T item = this._bag[this._count];
    this._bag[_count] = null;
    (this._count)--;
    return item;
}