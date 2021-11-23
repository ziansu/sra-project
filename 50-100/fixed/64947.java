@org.junit.Test
public void testAdjacency_4() {
    test.BoardCell cell = new test.BoardCell();
    cell = intBoard.getCell(2, 3);
    java.util.Set<test.BoardCell> testList = intBoard.getAdjList(cell);
    assertTrue(testList.contains(intBoard.getCell(1, 3)));
    assertTrue(testList.contains(intBoard.getCell(2, 2)));
    assertEquals(3, testList.size());
}