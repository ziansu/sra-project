private boolean sequence(org.komodo.repository.internal.SequencerType sequencerType, javax.jcr.Property property, java.lang.String eventId) throws java.lang.Exception {
    sequencingActive = true;
    javax.jcr.Node outputNode = property.getParent();
    switch (sequencerType) {
        case VDB :
        case CONNECTION :
        case DATA_SERVICE :
            outputNode = outputNode.getParent();
            break;
        default :
            break;
    }
    return sequence(sequencerType, property, outputNode, eventId);
}