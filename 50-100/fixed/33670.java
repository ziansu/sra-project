public static void assertNotEquals(java.lang.String first, java.lang.String second) throws java.lang.AssertionError {
    if (((first == null) && (second == null)) || ((first != null) && (first.equals(second)))) {
        throw new java.lang.AssertionError(java.lang.String.format(ca.watier.defassert.Assert.ERROR_OBJECTS_ARE_EQUALS, "strings"));
    }
}