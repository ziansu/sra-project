@org.junit.Test
public void testSearch() {
    int[] numbers = new int[]{ 23 , 76 , 5 , 32 , 2 , 8 , 4 , 9 , 6 };
    for (int num : numbers) {
        tree.insert(num);
    }
    int key = 2;
    assertEquals(2, tree.search(key));
    int key2 = 2234;
    assertEquals(0, tree.search(key2));
}