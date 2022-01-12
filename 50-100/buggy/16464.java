public void testArgumentValidation_NotDisjoint_ValidationSkipped() {
    java.util.Set<java.lang.Integer> s1 = com.googlecode.cqengine.TransactionalIndexedCollectionTest.asSet(1, 2, 3);
    java.util.Set<java.lang.Integer> s2 = com.googlecode.cqengine.TransactionalIndexedCollectionTest.asSet(3, 4, 5);
    com.googlecode.cqengine.TransactionalIndexedCollection<java.lang.Integer> indexedCollection = new com.googlecode.cqengine.TransactionalIndexedCollection<java.lang.Integer>(java.lang.Integer.class);
    indexedCollection.update(s1, s2, com.googlecode.cqengine.query.QueryFactory.queryOptions(com.googlecode.cqengine.query.QueryFactory.argumentValidation(com.googlecode.cqengine.query.option.ArgumentValidationStrategy.SKIP)));
}