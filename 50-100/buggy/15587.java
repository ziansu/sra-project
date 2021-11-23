@org.testng.annotations.Test
public void testUpdateAttribute() {
    java.lang.String entityName = "entityName";
    when(entityType.getFullyQualifiedName()).thenReturn(entityName);
    org.molgenis.data.meta.model.Attribute attr = mock(org.molgenis.data.meta.model.Attribute.class);
    org.molgenis.data.meta.model.Attribute updatedAttr = mock(org.molgenis.data.meta.model.Attribute.class);
    repoCollectionDecorator.updateAttribute(entityType, attr, updatedAttr);
    verify(updatedEntityType).removeAttribute(attr);
    verify(updatedEntityType).addAttribute(updatedAttr);
    verify(repoCollection).updateAttribute(entityType, attr, updatedAttr);
    verify(entityTypeRegistry).registerEntityType(updatedEntityType);
}