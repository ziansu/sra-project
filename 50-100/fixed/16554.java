@org.junit.Test
public void select2Nodes_From4AvailableNodes_Selected2Nodes() throws java.lang.Exception {
    utils.RandomNodesSelector nodesSelector = new utils.RandomNodesSelector(java.util.Arrays.asList(new network.Node(0), new network.Node(1), new network.Node(2), new network.Node(3)));
    java.util.Collection<network.Node> selectedNodes = nodesSelector.selectNodes(2);
    org.hamcrest.MatcherAssert.assertThat(selectedNodes.size(), org.hamcrest.Matchers.is(2));
}