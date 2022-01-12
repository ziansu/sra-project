@java.lang.Override
public void leafSetEntryNode(final org.opendaylight.yangtools.yang.common.QName name, final java.lang.Object value, final java.util.Map<org.opendaylight.yangtools.yang.common.QName, java.lang.String> attributes) throws java.io.IOException {
    final org.opendaylight.yangtools.yang.model.api.LeafListSchemaNode schema = tracker.leafSetEntryNode(name);
    writeElement(schema.getQName(), value, attributes, schema);
}