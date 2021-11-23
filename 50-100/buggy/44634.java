public void add(Item item) {
    Bag.Node<Item> oldfirst = first;
    first = new Bag.Node<Item>();
    first.item = item;
    first.lru = new LRUCache(maxCacheSize);
    first.lrfu = new LRFUCache(maxCacheSize);
    first.lru2 = new LRU2(maxCacheSize);
    first.arc = new ARCCache(maxCacheSize);
    first.twoQueue = new TwoQueues(maxCacheSize);
    first.mq = new MQueue(maxCacheSize);
    first.lirs = new LIRSCache(maxCacheSize);
    first.next = oldfirst;
    (n)++;
}