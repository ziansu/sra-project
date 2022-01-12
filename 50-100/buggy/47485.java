@java.lang.Override
public void updateAttribute(org.molgenis.data.meta.model.EntityType entityType, org.molgenis.data.meta.model.Attribute attr, org.molgenis.data.meta.model.Attribute updatedAttr) {
    repoCollection.updateAttribute(entityType, attr, updatedAttr);
    org.molgenis.data.meta.model.EntityType updatedEntityType = repoCollection.getRepository(entityType.getName()).getEntityType();
    entityTypeRegistry.unregisterEntityType(updatedEntityType);
}