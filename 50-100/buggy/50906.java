@cucumber.api.java.en.And(value = "^If I search for topology templates I can find one with the name \"([^\"]*)\" and store the related topology as a SPEL context$")
public void searchForTopologyTemplateByName(java.lang.String topologyTemplateName) throws java.lang.Throwable {
    java.lang.String topologyId = getTopologyIdFromTemplateName(topologyTemplateName, null);
    org.junit.Assert.assertNotNull((("A topology template named " + topologyTemplateName) + " can not be found"), topologyId);
    java.lang.String response = alien4cloud.it.Context.getRestClientInstance().get(("/rest/v1/topologies/" + topologyId));
    alien4cloud.rest.model.RestResponse<alien4cloud.topology.TopologyDTO> topologyDto = alien4cloud.rest.utils.JsonUtil.read(response, alien4cloud.topology.TopologyDTO.class, alien4cloud.it.Context.getJsonMapper());
    alien4cloud.it.Context.getInstance().buildEvaluationContext(topologyDto.getData().getTopology());
}