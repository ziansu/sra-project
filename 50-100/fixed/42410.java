private org.talend.core.model.metadata.builder.connection.ConceptTarget mockConceptTarget(java.lang.String targetName, java.lang.String loopExpression) {
    org.talend.core.model.metadata.builder.connection.ConceptTarget conceptTarget = mock(org.talend.core.model.metadata.builder.connection.ConceptTarget.class);
    when(conceptTarget.getTargetName()).thenReturn(targetName);
    when(conceptTarget.getRelativeLoopExpression()).thenReturn(loopExpression);
    return conceptTarget;
}