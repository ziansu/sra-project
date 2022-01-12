@cucumber.api.java.en.Then(value = "^The RestResponse should contain a topology$")
public void The_RestResponse_should_contain_a_topology() throws java.lang.Throwable {
    java.lang.String topologyResponseText = alien4cloud.it.Context.getInstance().getRestResponse();
    alien4cloud.rest.model.RestResponse<alien4cloud.topology.TopologyDTO> topologyResponse = alien4cloud.rest.utils.JsonUtil.read(topologyResponseText, alien4cloud.topology.TopologyDTO.class, alien4cloud.it.Context.getJsonMapper());
    org.junit.Assert.assertNotNull(topologyResponse.getData());
    org.junit.Assert.assertNotNull(topologyResponse.getData().getTopology().getId());
}