@java.lang.Override
public void leafSetEntryNode(final org.opendaylight.yangtools.yang.common.QName name, final java.lang.Object value) throws java.io.IOException {
    final org.opendaylight.yangtools.yang.model.api.LeafListSchemaNode schema = tracker.leafSetEntryNode();
    writeElement(schema.getQName(), value, java.util.Collections.emptyMap(), schema);
}