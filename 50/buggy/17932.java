@org.junit.Test
public void searchMultiElementPresentUneven() {
    assertEquals(0, chop.search(1, new int[]{ 1 , 3 , 5 }));
}