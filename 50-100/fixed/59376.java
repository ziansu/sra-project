@java.lang.Override
public void leafSetEntryNode(final java.lang.Object value) throws java.io.IOException {
    final org.opendaylight.mdsal.binding.javav2.dom.codec.impl.context.base.LeafNodeCodecContext<?> ctx = ((org.opendaylight.mdsal.binding.javav2.dom.codec.impl.context.base.LeafNodeCodecContext<?>) (current()));
    getDelegate().leafSetEntryNode(ctx.getSchema().getQName(), ctx.getValueCodec().serialize(value));
}