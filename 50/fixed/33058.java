@java.lang.Override
protected com.floragunn.searchguard.action.configupdate.ConfigUpdateResponse.Node newNodeResponse() {
    return new com.floragunn.searchguard.action.configupdate.ConfigUpdateResponse.Node(clusterService.localNode(), new java.lang.String[0], null);
}