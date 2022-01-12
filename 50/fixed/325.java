@java.lang.Override
public Item get(int index) {
    if (index < (capacity)) {
        int pos = ((front) + index) % (capacity);
        return items[pos];
    }
    return null;
}