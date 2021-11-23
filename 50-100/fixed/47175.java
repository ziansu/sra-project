@org.junit.Test
public void testLookupPropertyTypeByFqn() {
    com.dataloom.edm.internal.PropertyType propertyType = createPropertyType();
    java.util.UUID maybePropertyTypeId = edm.getPropertyTypeId(propertyType.getType().getNamespace(), propertyType.getType().getName());
    org.junit.Assert.assertNotNull(maybePropertyTypeId);
    org.junit.Assert.assertEquals(propertyType.getId(), maybePropertyTypeId);
}