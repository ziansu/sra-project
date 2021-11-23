private void checkArraysSize() {
    if (((arrayLength) - (size)) == ((arrayLength) / 3)) {
        resizeArray(((arrayLength) * 2));
        arrayLength = (arrayLength) * 2;
    }
}