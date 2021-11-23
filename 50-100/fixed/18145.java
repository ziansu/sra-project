@org.junit.Test
public void testLookupEntityTypeByFqn() {
    com.dataloom.edm.internal.EntityType entityType = createEntityType();
    java.util.UUID maybeEntityTypeId = edm.getEntityTypeId(entityType.getType().getNamespace(), entityType.getType().getName());
    org.junit.Assert.assertNotNull(maybeEntityTypeId);
    org.junit.Assert.assertEquals(entityType.getId(), maybeEntityTypeId);
}