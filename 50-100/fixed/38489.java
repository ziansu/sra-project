public Item removeLast() {
    if ((_size) <= 0) {
        throw new java.util.NoSuchElementException("");
    }
    Item value = _items[_lastIndex];
    _items[_lastIndex] = null;
    (_size)--;
    (_lastIndex)++;
    return value;
}