public Item[] toArray() {
    @java.lang.SuppressWarnings(value = "unchecked")
    Item[] items = ((Item[]) (new java.lang.Object[size]));
    Deque<Item>.Node n = first;
    for (int i = 0; i < (items.length); i++) {
        items[i] = n.item;
        n = n.next;
    }
    return items;
}