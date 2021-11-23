protected javax.persistence.criteria.Predicate getSearchPredicate(javax.persistence.criteria.CriteriaBuilder builder, javax.persistence.criteria.Root root, java.lang.String s) {
    return builder.or(builder.like(root.get(Order_.id), s), builder.like(root.get(Order_.customer), s));
}