protected java.util.List<javax.persistence.criteria.Order> getOrder(lemming.data.CriteriaBuilder criteriaBuilder, lemming.data.Root<T> root, java.util.Map<java.lang.String, lemming.data.Join<?, ?>> joins) {
    java.lang.String property = lemming.data.GenericDataProvider.getSort().getProperty();
    java.util.List<javax.persistence.criteria.Order> orderList = lemming.data.CriteriaHelper.getOrder(criteriaBuilder, root, joins, property, lemming.data.GenericDataProvider.getSort().isAscending(), typeClass);
    return orderList;
}