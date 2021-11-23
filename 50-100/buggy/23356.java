private void findAndDelete(final K key) {
    final org.apache.commons.lang3.tuple.Pair<org.vtsukur.algorithms.symbol_table.SingleLinkedListComparableBasedSymbolTable.Node<K, V>, org.vtsukur.algorithms.symbol_table.SingleLinkedListComparableBasedSymbolTable.Node<K, V>> targetAndPrev = findWithPrev(key);
    final org.vtsukur.algorithms.symbol_table.SingleLinkedListComparableBasedSymbolTable.Node<K, V> target = targetAndPrev.getLeft();
    if (target != null) {
        final org.vtsukur.algorithms.symbol_table.SingleLinkedListComparableBasedSymbolTable.Node<K, V> prev = targetAndPrev.getRight();
        prev.next = target.next;
        target.value = null;
        target.next = null;
        --(size);
    }
}