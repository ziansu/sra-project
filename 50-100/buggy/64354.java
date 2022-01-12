@java.lang.Override
public boolean containsValue(java.lang.Object value) {
    for (ua.yandex.prioritymap.PriorityHashMap.Node<K, V> currentNode : table) {
        while (currentNode != null) {
            V nodeValue = currentNode.value;
            if (java.util.Objects.equals(value, nodeValue)) {
                return true;
            }
            currentNode = currentNode.nextNode;
        } 
    }
    return false;
}