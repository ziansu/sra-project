@java.lang.Override
public com.beehyv.nmsreporting.model.Role findByRoleDescription(java.lang.String role) {
    org.hibernate.Criteria criteria = createEntityCriteria();
    criteria.add(org.hibernate.criterion.Restrictions.eq("role_desc", role));
    return ((com.beehyv.nmsreporting.model.Role) (criteria.list().get(0)));
}