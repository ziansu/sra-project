@org.junit.Before
public void setUp() {
    pf = org.mockito.Mockito.mock(com.github.fishio.PlayingField.class);
    com.github.fishio.Entity entity = org.mockito.Mockito.mock(com.github.fishio.Entity.class);
    org.mockito.Mockito.when(entity.getEntityId()).thenReturn(10);
    queue = new java.util.LinkedList<com.github.fishio.Entity>();
    queue.add(entity);
    org.mockito.Mockito.when(pf.getEntities()).thenReturn(queue);
}