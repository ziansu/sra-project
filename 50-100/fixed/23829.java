private java.util.List<com.centuria.sentinel.model.PersonRole> getRoles() {
    org.hibernate.Criteria criteria = sentinelDatabase.createCriteria(com.centuria.sentinel.model.PersonRole.class);
    criteria.add(org.hibernate.criterion.Restrictions.eq("personRolePK.person", currentUser));
    return ((java.util.List<com.centuria.sentinel.model.PersonRole>) (criteria.list()));
}