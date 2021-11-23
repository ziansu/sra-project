public boolean canBeChildOf(org.esbtools.message.admin.model.MetadataType parentType) {
    if ((checkEntitiesChildren(parentType)) || (checkSearchKeysChildren(parentType))) {
        return true;
    }else {
        return false;
    }
}