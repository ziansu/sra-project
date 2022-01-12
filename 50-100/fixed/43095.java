@org.junit.Test
public void testCustomFlavorDependencies() throws org.auraframework.throwable.quickfix.QuickFixException {
    org.auraframework.def.DefDescriptor<org.auraframework.def.ComponentDef> cmp = addComponentDef("<aura:component><div aura:flavorable='true'></div></aura:component>");
    org.auraframework.def.DefDescriptor<org.auraframework.def.FlavoredStyleDef> custom = addCustomFlavor(cmp, ".THIS--test{}");
    java.util.Set<org.auraframework.def.DefDescriptor<?>> dependencies = com.google.common.collect.Sets.newHashSet();
    definitionService.getDefinition(custom).appendDependencies(dependencies);
    assertEquals("didn't get expected dependencies for custom flavor", 1, dependencies.size());
    assertTrue(dependencies.contains(cmp));
}