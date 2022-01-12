@java.lang.Override
public org.onosproject.yang.model.SchemaContext getContext() {
    org.onosproject.yang.runtime.impl.DefaultYangModelRegistry registry = ((org.onosproject.yang.runtime.impl.DefaultYangModelRegistry) (org.onosproject.yang.serializers.xml.MockYangSerializerContext.schemaProvider.registry()));
    return registry;
}