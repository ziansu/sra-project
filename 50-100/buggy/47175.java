@org.junit.Test
public void testLookupPropertyTypeByFqn() {
    org.apache.commons.lang3.tuple.Pair<java.util.UUID, com.dataloom.edm.internal.PropertyType> propertyTypePair = createPropertyType();
    com.dataloom.edm.internal.PropertyType propertyType = edm.getPropertyType(propertyTypePair.getLeft());
    org.junit.Assert.assertNotNull(propertyType);
    java.util.UUID maybePropertyTypeId = edm.getPropertyTypeId(propertyType.getType().getNamespace(), propertyType.getType().getName());
    org.junit.Assert.assertNotNull(maybePropertyTypeId);
    org.junit.Assert.assertEquals(propertyTypePair.getLeft(), maybePropertyTypeId);
}