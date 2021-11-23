@org.junit.Test
public void testStandardFlavorDependencies() throws org.auraframework.throwable.quickfix.QuickFixException {
    org.auraframework.def.DefDescriptor<org.auraframework.def.ComponentDef> cmp = addComponentDef("<aura:component><div aura:flavorable='true'></div></aura:component>");
    org.auraframework.def.DefDescriptor<org.auraframework.def.FlavoredStyleDef> standard = addStandardFlavor(cmp, ".THIS--test {color:red}");
    java.util.Set<org.auraframework.def.DefDescriptor<?>> dependencies = com.google.common.collect.Sets.newHashSet();
    definitionService.getDefinition(standard).appendDependencies(dependencies);
    assertEquals("didn't get expected dependencies for standard flavor", 0, dependencies.size());
}