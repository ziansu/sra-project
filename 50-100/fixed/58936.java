@java.lang.Override
public java.util.List<org.ikasan.topology.model.RoleFilter> getRoleFiltersByRoleId(java.util.List<java.lang.Long> roleIds) {
    if ((roleIds == null) || (roleIds.isEmpty())) {
        return new java.util.ArrayList<org.ikasan.topology.model.RoleFilter>();
    }
    org.hibernate.criterion.DetachedCriteria criteria = org.hibernate.criterion.DetachedCriteria.forClass(org.ikasan.topology.model.RoleFilter.class);
    criteria.add(org.hibernate.criterion.Restrictions.in("id.roleId", roleIds));
    return ((java.util.List<org.ikasan.topology.model.RoleFilter>) (this.getHibernateTemplate().findByCriteria(criteria)));
}