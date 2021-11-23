public void createHeap() {
    rootHeapNode = new de.phip1611.numeric_sort_algorithms.Heapsort.HeapNode(nums[0], 1);
    createHeapRecursively(rootHeapNode, 1, nums.length);
}