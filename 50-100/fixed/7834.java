@org.junit.Test
public void createPolicyWithConfigurationAndConfigurationData02() {
    try (java.io.InputStream is = io.gravitee.gateway.policy.PolicyConfigurationFactoryTest.class.getResourceAsStream("policy-configuration-02.json")) {
        java.lang.String configuration = org.apache.commons.io.IOUtils.toString(is, "UTF-8");
        io.gravitee.gateway.policy.DummyPolicyConfiguration policyConfiguration = policyConfigurationFactory.create(io.gravitee.gateway.policy.DummyPolicyConfiguration.class, configuration);
        org.junit.Assert.assertNotNull(policyConfiguration);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}