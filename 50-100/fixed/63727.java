public Item remove() {
    Item data = elements[(--(n))];
    elements[n] = null;
    if ((n) <= ((capacity) / 4)) {
        resize(((capacity) / 2));
    }
    return data;
}