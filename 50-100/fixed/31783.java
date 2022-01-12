@java.lang.Override
public void leafSetEntryNode(final java.lang.Object value) throws java.io.IOException {
    final org.opendaylight.yangtools.yang.model.api.LeafListSchemaNode schema = tracker.leafSetEntryNode();
    final org.opendaylight.yangtools.yang.data.codec.gson.JSONCodec<java.lang.Object> codec = codecs.codecFor(schema);
    context.emittingChild(codecs.getSchemaContext(), writer);
    writeValue(value, codec);
}