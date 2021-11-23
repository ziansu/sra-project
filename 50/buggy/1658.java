@org.junit.Test
public void testGetConvNodeId() throws java.lang.Exception {
    conversionTable.addEntryNode("NetworkId", "NodeId", "FederatedNetworkId", "NetworkId_NodeId");
    java.lang.String result = target.getConvNodeId("NetworkId", "NodeId");
    org.junit.Assert.assertThat(result, org.hamcrest.CoreMatchers.is("FederatedNetworkId::NetworkId_NodeId"));
}