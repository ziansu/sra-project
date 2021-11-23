@org.junit.Test
public void testValidatePool() throws javax.naming.ConfigurationException {
    java.util.Map<java.lang.String, java.lang.Object> par = new java.util.HashMap(com.cloud.hypervisor.ovm3.resources.helpers.Ovm3ConfigurationTest.params);
    par.put("cluster", "1");
    par.put("ovm3vip", "this is not an IP!");
    ovm3config = new com.cloud.hypervisor.ovm3.resources.helpers.Ovm3Configuration(par);
    results.basicBooleanTest(ovm3config.getAgentInOvm3Pool(), false);
    results.basicBooleanTest(ovm3config.getAgentInOvm3Cluster(), false);
    results.basicStringTest(ovm3config.getOvm3PoolVip(), "");
}