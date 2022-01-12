public T findByUniqueColumnValue(java.lang.Object value, java.lang.String columnName) {
    return ((T) (createEntityCriteria().add(org.hibernate.criterion.Restrictions.eq(columnName, value)).uniqueResult()));
}