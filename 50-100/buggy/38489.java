public Item removeLast() {
    Item value = _items[_lastIndex];
    if (value == null) {
        throw new java.util.NoSuchElementException("");
    }
    _items[_lastIndex] = null;
    (_size)--;
    (_lastIndex)++;
    return value;
}