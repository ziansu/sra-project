private org.sbolstandard.core2.SequenceAnnotation seqAnnRefersToComponent(java.awt.Component component, org.sbolstandard.core2.ComponentDefinition parentCD) {
    org.sbolstandard.core2.SequenceAnnotation result = null;
    for (org.sbolstandard.core2.SequenceAnnotation sa : parentCD.getSequenceAnnotations()) {
        if (sa.getComponentURI().equals(component.getIdentity())) {
            result = sa;
            break;
        }
    }
    return result;
}