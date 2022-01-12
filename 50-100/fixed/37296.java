@org.junit.Test
public void testGetNeighboursInBoard() {
    java.util.Set<goController.Stone> neighbors = board.getNeighbors(stonePositions[1][1], stonePositions);
    assertEquals(4, neighbors.size());
    int blackNeighbors = 0;
    for (goController.Stone s : neighbors)
        if ((s.getOwner()) == (goController.StoneOwner.BLACK))
            blackNeighbors++;
        
    
    assertEquals(3, blackNeighbors);
}