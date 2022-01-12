@org.junit.Test
public void a_full_site_should_be_connected_to_the_virtual_top_site() throws java.lang.Exception {
    org.powermock.api.mockito.PowerMockito.whenNew(edu.princeton.cs.algs4.WeightedQuickUnionUF.class).withAnyArguments().thenReturn(unionFind);
    Percolation percolation = new Percolation(3);
    percolation.isFull(2, 2);
    org.mockito.Mockito.verify(unionFind).connected(0, 5);
}