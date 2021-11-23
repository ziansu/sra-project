@org.testng.annotations.Test
public void testDeleteAttribute() {
    java.lang.String entityName = "entityName";
    when(entityType.getFullyQualifiedName()).thenReturn(entityName);
    org.molgenis.data.meta.model.Attribute attr = mock(org.molgenis.data.meta.model.Attribute.class);
    repoCollectionDecorator.deleteAttribute(entityType, attr);
    verify(updatedEntityType).removeAttribute(attr);
    verify(repoCollection).deleteAttribute(entityType, attr);
    verify(entityTypeRegistry).registerEntityType(updatedEntityType);
}