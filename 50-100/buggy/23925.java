@java.lang.Override
public java.util.Collection<V> values() {
    V[] values = ((V[]) (new java.lang.Object[size]));
    {
        int insertionIndex = 0;
        for (ua.yandex.prioritymap.PriorityHashMap.Node<K, V> currentNode : table) {
            while (currentNode != null) {
                V nodeValue = currentNode.value;
                values[insertionIndex] = nodeValue;
                insertionIndex++;
                currentNode = currentNode.nextNode;
            } 
        }
    }
    return new ImmutableFictiveSet<>(values);
}