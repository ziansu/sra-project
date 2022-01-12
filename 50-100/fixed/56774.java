@org.junit.Test
public void testAgentPort() throws javax.naming.ConfigurationException {
    java.util.HashMap<java.lang.String, java.lang.Object> par = new java.util.HashMap<java.lang.String, java.lang.Object>(com.cloud.hypervisor.ovm3.resources.helpers.Ovm3ConfigurationTest.params);
    java.lang.String altPort = "6333";
    par.put("agentport", altPort);
    ovm3config = new com.cloud.hypervisor.ovm3.resources.helpers.Ovm3Configuration(par);
    results.basicIntTest(java.lang.Integer.parseInt(altPort), ovm3config.getAgentOvsAgentPort());
}