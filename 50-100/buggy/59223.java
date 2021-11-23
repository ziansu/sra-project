public void testTwoMiniheaps() {
    org.apache.lucene.search.BHeap heap = new org.apache.lucene.search.BHeap(20, 2);
    org.apache.lucene.search.TestBHeap.insert(heap, 100, 99, 101, 87);
    org.apache.lucene.search.TestBHeap.assertHeap(heap, new long[][]{ new long[]{ 87 , 99 , 101 } , new long[]{ 100 } });
}