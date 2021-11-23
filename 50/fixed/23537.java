@org.junit.Test
public void addLink_Node0ToNode1ButNode0WasNotAddedToTheNetwork_ThrowsNodeNotFoundException() throws java.lang.Exception {
    net.addNode(1);
    thrown.expect(network.exceptions.NodeNotFoundException.class);
    net.addLink(0, 1, new stubs.StubLabel());
}