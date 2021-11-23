public Item remove() {
    Item data = elements[(--(n))];
    elements[n] = null;
    if ((n) <= ((capacity) / 4)) {
        resize(((n) / 2));
    }
    return data;
}