@java.lang.Override
public kamienica.feature.tenant.Tenant getTenantForApartment(kamienica.model.Apartment ap) {
    org.hibernate.Criteria criteria = createEntityCriteria();
    criteria.add(org.hibernate.criterion.Restrictions.eq("apartment", ap)).add(org.hibernate.criterion.Restrictions.eq("status", Status.ACTIVE));
    return ((kamienica.feature.tenant.Tenant) (criteria.uniqueResult()));
}