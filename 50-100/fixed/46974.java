public static void checkCollectionValid(java.lang.String collection) {
    org.rakam.util.ValidationUtil.checkArgument((collection != null), "collection is null");
    org.rakam.util.ValidationUtil.checkArgument((!(collection.isEmpty())), "collection is empty string");
    if ((collection.length()) > 250) {
        throw new java.lang.IllegalArgumentException("Collection name must have maximum 250 characters.");
    }
}