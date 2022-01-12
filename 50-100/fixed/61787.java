@org.junit.Test
public final void testSpawn() {
    ball.spawn(root, space, false);
    org.mockito.Mockito.verify(g).addControl(phy);
    org.mockito.Mockito.verify(space).add(phy);
    org.mockito.Mockito.verify(root).attachChild(g);
    org.mockito.Mockito.verifyNoMoreInteractions(phy);
}