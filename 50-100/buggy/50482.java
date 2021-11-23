public void remove(int index) {
    for (int i = index + 1; i < (this._size); i++) {
        this._data[i] = this._data[(i - 1)];
    }
    (this._size)--;
}