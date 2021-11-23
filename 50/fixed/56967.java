public com.mojang.ld22.item.Item remove(int idx) {
    com.mojang.ld22.item.Item i = get(idx);
    items.remove(i);
    return i;
}