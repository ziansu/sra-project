private org.talend.core.model.metadata.builder.connection.Concept mockConcept(java.lang.String label) {
    org.talend.core.model.metadata.builder.connection.Concept concept = mock(org.talend.core.model.metadata.builder.connection.Concept.class);
    when(concept.getLabel()).thenReturn(label);
    org.eclipse.emf.common.util.EList<org.talend.core.model.metadata.builder.connection.ConceptTarget> targets = new org.eclipse.emf.common.util.BasicEList<org.talend.core.model.metadata.builder.connection.ConceptTarget>();
    when(concept.getConceptTargets()).thenReturn(targets);
    return concept;
}