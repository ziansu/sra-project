public dictionary.Dictionary clone() {
    java.util.List<algorithms.heap.MaxHeap<dictionary.Word>> newHeap = new java.util.ArrayList<>();
    for (algorithms.heap.MaxHeap<dictionary.Word> heap : words) {
        newHeap.add(heap.clone());
    }
    return new dictionary.Dictionary(newHeap, data, fileName, validator, updater, new java.util.ArrayList(wordsList), changed);
}