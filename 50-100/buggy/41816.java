@java.lang.Override
public java.util.Set<K> keySet() {
    K[] keys = ((K[]) (new java.lang.Comparable[size]));
    {
        int insertionIndex = 0;
        for (ua.yandex.prioritymap.PriorityHashMap.Node<K, V> currentNode : table) {
            while (currentNode != null) {
                K nodeKey = currentNode.key;
                keys[insertionIndex] = nodeKey;
                insertionIndex++;
                currentNode = currentNode.nextNode;
            } 
        }
    }
    return new ImmutableFictiveSet<>(keys);
}