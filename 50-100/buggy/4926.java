@java.lang.Override
public void startleafNode(final java.lang.String localName, final java.lang.Object value) throws java.io.IOException {
    final java.util.Map.Entry<org.opendaylight.yangtools.yang.data.api.YangInstanceIdentifier.NodeIdentifier, java.lang.Object> dom = serializeLeaf(localName, value);
    getDelegate().leafNode(dom.getKey(), dom.getValue());
}