public boolean canBeChildOf(org.esbtools.message.admin.model.MetadataType parentType) {
    return (checkEntitiesChildren(parentType)) || (checkSearchKeysChildren(parentType));
}