private java.util.Collection<org.opendaylight.yangtools.yang.data.api.schema.UnkeyedListEntryNode> reusableSequence(final org.opendaylight.yangtools.yang.data.api.schema.UnkeyedListEntryNode segment) {
    final com.google.common.base.Optional<org.opendaylight.yangtools.yang.data.api.schema.NormalizedNode<?, ?>> maybeAsSequence = org.opendaylight.yangtools.yang.data.api.schema.NormalizedNodes.findNode(segment, this.asPathChoice, this.asPathList, this.asPathSequence);
    if (maybeAsSequence.isPresent()) {
        final org.opendaylight.yangtools.yang.data.api.schema.UnkeyedListNode asList = ((org.opendaylight.yangtools.yang.data.api.schema.UnkeyedListNode) (maybeAsSequence.get()));
        if ((asList.getSize()) < 255) {
            return asList.getValue();
        }
    }
    return null;
}