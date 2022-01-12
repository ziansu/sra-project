@java.lang.Override
public java.lang.String generateId(eu.neclab.iotplatform.ngsi.api.datamodel.EntityId entityId) {
    if (((entityId.getType()) == null) || (entityId.getType().toString().isEmpty())) {
        return entityId.getId();
    }else {
        return ((entityId.getId()) + (eu.neclab.iotplatform.iotbroker.embeddediotagent.indexer.Indexer.ENTITY_TO_TYPE_SEPARATOR)) + (entityId.getType().toString());
    }
}