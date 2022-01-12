@org.junit.Test
public void testGetNeighborsAtEdge() {
    java.util.Set<goController.Stone> neigbors = board.getNeighbors(stonePositions[((height) - 1)][1], stonePositions);
    assertEquals(3, neigbors.size());
}