public T get(int index) {
    if ((index >= (size)) || (index < 0)) {
        return null;
    }
    return items[addIndex(nextFirst, (index + 1))];
}