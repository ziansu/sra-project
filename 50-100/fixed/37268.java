@org.junit.Test
public void definition_withDynamicProperty_unitInLowerCase() throws java.lang.Exception {
    io.gravitee.definition.model.Api api = load("/io/gravitee/definition/jackson/services/dynamicproperty/api-withservice-dynamicproperty-unitInLowerCase.json", io.gravitee.definition.model.Api.class);
    io.gravitee.definition.model.services.dynamicproperty.DynamicPropertyService dynamicPropertyService = api.getService(io.gravitee.definition.model.services.dynamicproperty.DynamicPropertyService.class);
    org.junit.Assert.assertNotNull(dynamicPropertyService);
    org.junit.Assert.assertTrue(dynamicPropertyService.isEnabled());
    org.junit.Assert.assertEquals(60, dynamicPropertyService.getTrigger().getRate());
    org.junit.Assert.assertEquals(java.util.concurrent.TimeUnit.SECONDS, dynamicPropertyService.getTrigger().getUnit());
}