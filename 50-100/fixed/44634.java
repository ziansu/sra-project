public void add(Item item) {
    Bag.Node<Item> oldfirst = first;
    first = new Bag.Node<Item>();
    first.item = item;
    first.lru = new LRUCache(maxCacheSize);
    first.next = oldfirst;
    (n)++;
}