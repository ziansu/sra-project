@java.lang.Override
public java.util.Collection<com.foo.hazelcast.shared.Customer> findCustomersByDob(java.util.Date dobStart, java.util.Date dobEnd) {
    com.hazelcast.query.Predicate dobStartPredicate = com.hazelcast.query.Predicates.greaterEqual("dob", dobStart);
    com.hazelcast.query.Predicate dobEndPredicate = com.hazelcast.query.Predicates.lessThan("dob", dobEnd);
    com.hazelcast.query.Predicate andPredicate = com.hazelcast.query.Predicates.and(dobStartPredicate, dobEndPredicate);
    return idToCustomerMap.values(andPredicate);
}