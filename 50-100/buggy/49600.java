@java.lang.Override
public boolean equals(final java.lang.Object obj) {
    if (obj instanceof org.openbase.jul.extension.protobuf.IdentifiableMessage) {
        final org.openbase.jul.extension.protobuf.IdentifiableMessage other = ((org.openbase.jul.extension.protobuf.IdentifiableMessage) (obj));
        try {
            return new org.apache.commons.lang.builder.EqualsBuilder().append(getId(), other.getId()).isEquals();
        } catch (org.openbase.jul.exception.CouldNotPerformException ex) {
            return new org.apache.commons.lang.builder.EqualsBuilder().append(internalMessage, other.internalMessage).isEquals();
        }
    }else {
        return false;
    }
}