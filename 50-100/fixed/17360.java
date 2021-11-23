@java.lang.Override
public void onEntryHit(org.infinispan.commons.util.concurrent.jdk8backported.BoundedEquivalentConcurrentHashMapV8.Node<K, V> e, V value) {
    org.infinispan.commons.util.concurrent.jdk8backported.StrippedConcurrentLinkedDeque.DequeNode<org.infinispan.commons.util.concurrent.jdk8backported.BoundedEquivalentConcurrentHashMapV8.Node<K, V>> eviction = ((org.infinispan.commons.util.concurrent.jdk8backported.StrippedConcurrentLinkedDeque.DequeNode<org.infinispan.commons.util.concurrent.jdk8backported.BoundedEquivalentConcurrentHashMapV8.Node<K, V>>) (e.eviction));
    synchronized(eviction) {
        if ((eviction.item) != null) {
            eviction.item = null;
            deque.unlink(eviction);
            deque.linkLast(new org.infinispan.commons.util.concurrent.jdk8backported.StrippedConcurrentLinkedDeque.DequeNode<org.infinispan.commons.util.concurrent.jdk8backported.BoundedEquivalentConcurrentHashMapV8.Node<K, V>>(e));
        }
    }
}