@cucumber.api.java.en.Then(value = "^There\'s no defined scaling policy for the node \"([^\"]*)\"$")
public void There_s_no_defined_scaling_policy(java.lang.String nodeName) throws java.lang.Throwable {
    I_try_to_retrieve_the_created_topology();
    java.lang.String topologyResponseText = alien4cloud.it.Context.getInstance().getRestResponse();
    alien4cloud.rest.model.RestResponse<alien4cloud.topology.TopologyDTO> topologyResponse = alien4cloud.rest.utils.JsonUtil.read(topologyResponseText, alien4cloud.topology.TopologyDTO.class, alien4cloud.it.Context.getJsonMapper());
    org.junit.Assert.assertNotNull(topologyResponse.getData());
    alien4cloud.model.topology.ScalingPolicy computePolicy = alien4cloud.topology.TopologyUtils.getScalingPolicy(alien4cloud.topology.TopologyUtils.getScalableCapability(topologyResponse.getData().getTopology(), nodeName, true));
    org.junit.Assert.assertEquals(ScalingPolicy.NOT_SCALABLE_POLICY, computePolicy);
}