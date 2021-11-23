@java.lang.Override
public Item get(int index) {
    int pos = ((front) + index) % (capacity);
    return items[pos];
}