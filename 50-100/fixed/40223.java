@org.junit.Test
public final void testSpawnWithoutPhysics() {
    ball = new com.mycompany.mavenproject1.Ball(shape, g, mat, null);
    ball.spawn(root, null, false);
    org.mockito.Mockito.verifyNoMoreInteractions(phy);
    org.mockito.Mockito.verifyNoMoreInteractions(space);
    org.mockito.Mockito.verify(root).attachChild(g);
}