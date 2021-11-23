public void test2() {
    org.apache.lucene.search.BHeap heap = new org.apache.lucene.search.BHeap(20, 2);
    heap.insert(100);
    heap.insert(99);
    org.apache.lucene.search.TestBHeap.assertHeap(heap, new long[][]{ new long[]{ 100 , 99 } });
}