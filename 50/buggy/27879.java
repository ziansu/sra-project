@java.lang.Override
public void deleteAttribute(org.molgenis.data.meta.model.EntityType entityType, org.molgenis.data.meta.model.Attribute attr) {
    repoCollection.deleteAttribute(entityType, attr);
    org.molgenis.data.meta.model.EntityType updatedEntityType = repoCollection.getRepository(entityType.getName()).getEntityType();
    entityTypeRegistry.unregisterEntityType(updatedEntityType);
}