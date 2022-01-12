@java.lang.Override
protected org.auraframework.def.ComponentDefRef buildDefinition(org.auraframework.impl.root.component.ComponentDefRefImpl.Builder builder) throws java.lang.Exception {
    builder.setLocalId(this.localId);
    builder.setLoad(this.load);
    if ((this.attributeValues) != null) {
        for (java.util.Map.Entry<org.auraframework.def.DefDescriptor<org.auraframework.def.AttributeDef>, org.auraframework.def.AttributeDefRef> entry : attributeValues.entrySet()) {
            builder.setAttribute(entry.getKey(), entry.getValue());
        }
    }
    return super.buildDefinition(builder);
}