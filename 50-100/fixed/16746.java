public void between(java.lang.String propertyName, java.lang.Object begin, java.lang.Object end) {
    if (!(isNullOrEmpty(begin))) {
        this.predicates.add(criteriaBuilder.greaterThanOrEqualTo(getExpression(from, propertyName), ((java.lang.Comparable) (begin))));
    }
    if (!(isNullOrEmpty(end))) {
        this.predicates.add(criteriaBuilder.lessThanOrEqualTo(getExpression(from, propertyName), ((java.lang.Comparable) (end))));
    }
}