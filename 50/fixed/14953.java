@java.lang.Override
public java.util.List<com.beehyv.nmsreporting.model.Role> findByRoleDescription(java.lang.String role) {
    org.hibernate.Criteria criteria = createEntityCriteria();
    criteria.add(org.hibernate.criterion.Restrictions.eq("role_desc", role));
    return criteria.list();
}