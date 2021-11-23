@java.lang.Override
public ai.subut.kurjun.model.identity.RelationObject createRelationObject(java.lang.String objectId, int objectType) {
    try {
        ai.subut.kurjun.model.identity.RelationObject relationObject = new ai.subut.kurjun.core.dao.model.identity.RelationObjectEntity();
        if (com.google.common.base.Strings.isNullOrEmpty(objectId)) {
            relationObject.setObjectId(securityManager.generateUUIDRandom());
        }else {
            relationObject.setObjectId(objectId);
        }
        relationObject.setType(objectType);
        return relationObject;
    } catch (java.lang.Exception ex) {
        ai.subut.kurjun.identity.RelationManagerImpl.LOGGER.error(" ******* Error in RelationManager", ex);
        return null;
    }
}