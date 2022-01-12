@org.junit.Test
public void testAdjacency_5() {
    test.BoardCell cell = intBoard.getCell(0, 0);
    java.util.Map<test.BoardCell, java.util.Set<test.BoardCell>> map = intBoard.getAdjList();
    java.util.Set<test.BoardCell> testList = map.get(cell);
    assertTrue(testList.contains(intBoard.getCell(3, 2)));
    assertTrue(testList.contains(intBoard.getCell(2, 0)));
    assertEquals(2, testList.size());
}