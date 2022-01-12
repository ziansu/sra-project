@dk.nversion.copybook.Test
public void testFieldTypeStringSetToNullPacked() throws java.lang.Exception {
    dk.nversion.copybook.CopyBookSerializer serializer = new dk.nversion.copybook.CopyBookSerializer(dk.nversion.copybook.SerializerNullValuesTest.fieldTypeStringSetToNullPacked.class);
    dk.nversion.copybook.SerializerNullValuesTest.fieldTypeStringSetToNullPacked test = new dk.nversion.copybook.SerializerNullValuesTest.fieldTypeStringSetToNullPacked();
    test.field = null;
    byte[] testBytes = serializer.serialize(test);
    org.junit.Assert.assertArrayEquals(testBytes, new byte[]{ 0 , 0 , 0 , 0 });
    dk.nversion.copybook.SerializerNullValuesTest.fieldTypeStringSetToNullPacked test2 = serializer.deserialize(testBytes, dk.nversion.copybook.SerializerNullValuesTest.fieldTypeStringSetToNullPacked.class);
    org.junit.Assert.assertNull(test2.field);
}