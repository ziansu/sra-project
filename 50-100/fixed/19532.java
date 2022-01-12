@cucumber.api.java.en.Then(value = "^The topology should contain a nodetemplate named \"([^\"]*)\"$")
public void The_topology_should_contain_a_nodetemplate_named(java.lang.String name) throws java.lang.Throwable {
    java.lang.String topologyResponseText = alien4cloud.it.Context.getInstance().getRestResponse();
    alien4cloud.rest.model.RestResponse<alien4cloud.topology.TopologyDTO> topologyResponse = alien4cloud.rest.utils.JsonUtil.read(topologyResponseText, alien4cloud.topology.TopologyDTO.class, alien4cloud.it.Context.getJsonMapper());
    assertNotNull(topologyResponse.getData());
    java.util.Map<java.lang.String, alien4cloud.model.topology.NodeTemplate> nodeTemplates = topologyResponse.getData().getTopology().getNodeTemplates();
    assertNotNull(nodeTemplates);
    assertNotNull(nodeTemplates.get(name));
}