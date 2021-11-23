private void expand() {
    int[] modArr = new int[(_data.length) * 2];
    for (int i = 0; i < (_data.length); i++) {
        modArr[i] = _data[i];
    }
    _data = modArr;
}