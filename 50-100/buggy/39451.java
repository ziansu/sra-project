public void testPartition(ch02_LinkedLists.Node partitionedList, int x, int numLessThanX) {
    for (int i = 0; i < numLessThanX; i++) {
        org.junit.Assert.assertTrue(((partitionedList.data) < x));
        partitionedList = partitionedList.next;
    }
    while (partitionedList != null) {
        org.junit.Assert.assertTrue(((partitionedList.data) >= x));
    } 
}