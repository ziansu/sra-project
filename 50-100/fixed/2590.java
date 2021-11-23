@org.junit.Test
public void testAdjacency_5() {
    test.BoardCell cell = new test.BoardCell();
    cell = intBoard.getCell(3, 0);
    java.util.Set<test.BoardCell> testList = intBoard.getAdjList(cell);
    assertTrue(testList.contains(intBoard.getCell(2, 0)));
    assertTrue(testList.contains(intBoard.getCell(3, 1)));
    assertEquals(2, testList.size());
}