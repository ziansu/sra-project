private org.molgenis.data.meta.model.EntityType createMockEntityWithIdAttribute(java.lang.String entityName, org.molgenis.data.meta.model.Attribute idAttribute, java.lang.String idAttributeName) {
    org.molgenis.data.meta.model.EntityType result = org.mockito.Mockito.when(org.mockito.Mockito.mock(org.molgenis.data.meta.model.EntityType.class).getFullyQualifiedName()).thenReturn(entityName).getMock();
    org.mockito.Mockito.when(result.getName()).thenReturn(entityName);
    org.mockito.Mockito.when(result.getIdAttribute()).thenReturn(idAttribute);
    org.mockito.Mockito.when(result.getAttribute(idAttributeName)).thenReturn(idAttribute);
    return result;
}