@java.lang.SuppressWarnings(value = "unchecked")
public java.util.List<com.siddhrans.biometric.model.User> findAllUsers() {
    org.hibernate.Criteria criteria = createEntityCriteria().addOrder(org.hibernate.criterion.Order.asc("firstName"));
    criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
    java.util.List<com.siddhrans.biometric.model.User> users = ((java.util.List<com.siddhrans.biometric.model.User>) (criteria.list()));
    return users;
}