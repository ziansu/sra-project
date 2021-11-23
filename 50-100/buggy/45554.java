private void expand() {
    int[] modArr = new int[(_size) * 2];
    for (int i = 0; i < (_size); i++) {
        modArr[i] = _data[i];
    }
    _data = modArr;
    _size *= 2;
}