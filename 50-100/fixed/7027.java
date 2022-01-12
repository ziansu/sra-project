@org.auraframework.system.Annotations.AuraEnabled
public static org.auraframework.instance.Application getApplication(@org.auraframework.system.Annotations.Key(value = "name", loggable = true)
java.lang.String name, @org.auraframework.system.Annotations.Key(value = "attributes")
java.util.Map<java.lang.String, java.lang.Object> attributes) throws org.auraframework.throwable.quickfix.QuickFixException {
    org.auraframework.service.DefinitionService definitionService = org.auraframework.Aura.getDefinitionService();
    org.auraframework.def.DefDescriptor<org.auraframework.def.ApplicationDef> desc = definitionService.getDefDescriptor(name, org.auraframework.def.ApplicationDef.class);
    definitionService.updateLoaded(desc);
    return org.auraframework.Aura.getInstanceService().getInstance(desc, attributes);
}