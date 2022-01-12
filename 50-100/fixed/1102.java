@org.junit.Test
public void should_find_all_spies_registered_in_class() {
    final com.pchudzik.springmock.infrastructure.definition.registry.DoubleRegistry doubleRegistry = com.pchudzik.springmock.infrastructure.definition.registry.DoubleRegistryTestParser.parseClass(com.pchudzik.springmock.infrastructure.definition.registry.DoubleRegistryParserTest.MultipleRegisteredSpies.class);
    org.junit.Assert.assertEquals(2, doubleRegistry.getSpies().size());
    org.junit.Assert.assertThat(doubleRegistry.getSpies(), containsInAnyOrder(allOf(doubleWithName(com.pchudzik.springmock.infrastructure.definition.registry.DoubleRegistryParserTest.ANY_SERVICE1_NAME), doubleForClass(com.pchudzik.springmock.infrastructure.definition.registry.DoubleRegistryParserTest.AnyService1.class)), allOf(doubleWithName(com.pchudzik.springmock.infrastructure.definition.registry.DoubleRegistryParserTest.ANY_SERVICE2_NAME), doubleForClass(com.pchudzik.springmock.infrastructure.definition.registry.DoubleRegistryParserTest.AnyService2.class))));
}