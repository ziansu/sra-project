public static int getHashKeyOf(java.lang.String city, main.java.HashTable instance) throws test.java.HashTableTests.HashTableUtilException {
    try {
        java.lang.Integer hashValue = ((java.lang.Integer) (test.java.HashTableTests.HashTableTestUtilities.execute(test.java.HashTableTests.HashTableTestUtilities.HASH_KEY_METHOD_NAME, city, instance)));
        return hashValue.intValue();
    } catch (test.java.HashTableTests.HashTableUtilException e) {
        java.lang.System.out.println(e);
        throw new test.java.HashTableTests.HashTableUtilException(("Failed to retrieve a hash key for city: " + city));
    }
}