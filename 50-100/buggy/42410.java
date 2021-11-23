private org.talend.core.model.metadata.builder.connection.ConceptTarget mockConceptTarget(java.lang.String targetName, java.lang.String loopExpression) {
    org.talend.core.model.metadata.builder.connection.ConceptTarget conceptTarget = org.mockito.Mockito.mock(org.talend.core.model.metadata.builder.connection.ConceptTarget.class);
    org.mockito.Mockito.when(conceptTarget.getTargetName()).thenReturn(targetName);
    org.mockito.Mockito.when(conceptTarget.getRelativeLoopExpression()).thenReturn(loopExpression);
    return conceptTarget;
}