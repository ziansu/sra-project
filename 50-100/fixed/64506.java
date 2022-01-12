@java.lang.Override
public void leafNode(final org.opendaylight.yangtools.yang.data.api.YangInstanceIdentifier.NodeIdentifier name, final java.lang.Object value) throws java.io.IOException {
    final org.opendaylight.yangtools.yang.model.api.LeafSchemaNode schema = tracker.leafNode(name);
    final org.opendaylight.yangtools.yang.data.codec.gson.JSONCodec<java.lang.Object> codec = codecs.codecFor(schema);
    context.emittingChild(codecs.getSchemaContext(), writer);
    context.writeChildJsonIdentifier(codecs.getSchemaContext(), writer, name.getNodeType());
    writeValue(value, codec);
}