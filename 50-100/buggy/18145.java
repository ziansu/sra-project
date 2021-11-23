@org.junit.Test
public void testLookupEntityTypeByFqn() {
    org.apache.commons.lang3.tuple.Pair<java.util.UUID, com.dataloom.edm.internal.EntityType> entityTypePair = createEntityType();
    com.dataloom.edm.internal.EntityType entityType = edm.getEntityType(entityTypePair.getLeft());
    java.util.UUID maybeEntityTypeId = edm.getEntityTypeId(entityType.getType().getNamespace(), entityType.getType().getName());
    org.junit.Assert.assertEquals(entityTypePair.getLeft(), maybeEntityTypeId);
}