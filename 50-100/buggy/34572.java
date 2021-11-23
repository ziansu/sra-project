@org.junit.Test
public void testSetBlockBounds() {
    mockConfig.setRegionBounds(mockWorld, (-2), 1, (-1), 0);
    replayAll();
    manager.setBlockBounds(mockWorld, new java.awt.Point((-513), (-1)), new java.awt.Point(512, 50));
    verifyAll();
}