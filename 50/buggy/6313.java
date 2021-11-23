public int findMedian2() {
    if ((maxheap.size()) == (minheap.size())) {
        return minheap.peek();
    }else {
        return maxheap.peek();
    }
}