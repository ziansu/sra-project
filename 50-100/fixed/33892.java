@org.junit.Test
public void testGetParent() throws bsma.SizeException {
    java.lang.System.out.println("getParent");
    bsma.NodeTest.testNode = new bsma.Node(8);
    bsma.Node left = new bsma.Node(bsma.NodeTest.testNode, 4, 0);
    bsma.Node right = new bsma.Node(bsma.NodeTest.testNode, 4, 0);
    bsma.NodeTest.testNode.setChildren(left, right);
    bsma.Node expectedParent = bsma.NodeTest.testNode;
    bsma.Node parent = left.getParent();
    assert parent == expectedParent;
}