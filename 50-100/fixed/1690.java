@org.junit.Test
public void getSize_safety() {
    com.fuse.ui.Node n = new com.fuse.ui.Node();
    n.setSize(10, 10);
    org.junit.Assert.assertEquals(n.getSize(), new com.fuse.ui.PVector(10, 10, 0));
    com.fuse.ui.PVector tmp = n.getSize();
    tmp.add(new com.fuse.ui.PVector(10, 0, 0));
    org.junit.Assert.assertEquals(n.getSize(), new com.fuse.ui.PVector(10, 10, 0));
}