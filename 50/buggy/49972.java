public void add(com.alvin.common.tools.ConcurrentLRUMap.MapNode<K, V> node) {
    queue.offer(new Event(com.alvin.common.tools.ConcurrentLRUMap.ListWalker.Event.ADD, node));
}