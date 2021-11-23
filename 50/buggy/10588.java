@org.junit.Test
public void testRemoveMiddleNodeWithEvenNodes() {
    int num = 5;
    while (num > 0) {
        ll.add(num);
        --num;
    } 
    ll.removeMiddleNode();
    org.junit.Assert.assertEquals("1 -> 2 -> 4 -> 5", ll.toString());
}