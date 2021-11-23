private info.rmapproject.webapp.domain.Graph createAgentGraph(java.net.URI agentUri, java.lang.String agentName, java.lang.String idProvider, java.lang.String authId) throws java.lang.Exception {
    info.rmapproject.webapp.domain.Graph graph = new info.rmapproject.webapp.domain.Graph();
    java.lang.String sAgentUri = agentUri.toString();
    graph.addEdge(sAgentUri, idProvider, Terms.RMAP_IDENTITYPROVIDER_PATH, agentNodeType, agentNodeType);
    graph.addEdge(sAgentUri, authId, Terms.RMAP_USERAUTHID_PATH, agentNodeType, info.rmapproject.webapp.utils.WebappUtils.getNodeType(new java.net.URI(info.rmapproject.core.utils.Terms.RMAP_USERAUTHID_PATH)));
    return graph;
}