private java.util.LinkedList<org.opendaylight.yangtools.yang.data.impl.leafref.LeafRefContext> getLeafRefsFor(final org.opendaylight.yangtools.yang.model.api.DataSchemaNode node, final org.opendaylight.yangtools.yang.model.api.Module module) {
    final org.opendaylight.yangtools.yang.data.impl.leafref.LeafRefPath nodeXPath = org.opendaylight.yangtools.yang.data.impl.leafref.LeafRefUtils.schemaPathToLeafRefPath(node.getPath(), module);
    final java.util.LinkedList<org.opendaylight.yangtools.yang.data.impl.leafref.LeafRefContext> foundLeafRefs = new java.util.LinkedList<org.opendaylight.yangtools.yang.data.impl.leafref.LeafRefContext>();
    for (final org.opendaylight.yangtools.yang.data.impl.leafref.LeafRefContext leafref : leafRefs) {
        final org.opendaylight.yangtools.yang.data.impl.leafref.LeafRefPath leafRefTargetPath = leafref.getAbsoluteLeafRefTargetPath();
        if (leafRefTargetPath.equals(nodeXPath)) {
            foundLeafRefs.add(leafref);
        }
    }
    return foundLeafRefs;
}