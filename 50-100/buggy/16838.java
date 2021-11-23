@org.junit.Test
public void select1Node_AfterSelectingAll4AvailableNodes_Selected0Nodes() throws java.lang.Exception {
    utils.RandomNodesSelector nodesSelector = new utils.RandomNodesSelector(java.util.Arrays.asList(new network.Node(0), new network.Node(1), new network.Node(2), new network.Node(3)));
    nodesSelector.selectNodes(4);
    java.util.Collection<network.Node> selectedNodes = nodesSelector.selectNodes(1);
    java.lang.System.out.println(selectedNodes);
    org.hamcrest.MatcherAssert.assertThat(selectedNodes.size(), org.hamcrest.Matchers.is(0));
}