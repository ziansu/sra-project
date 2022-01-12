@java.lang.Override
public java.util.List<com.chua.distributions.database.entity.Product> findAllByCompanyOrderByCategory(java.lang.Long companyId) {
    return dao.findAllByCompanyWithOrder(companyId, new org.hibernate.criterion.Order[]{ org.hibernate.criterion.Order.asc("categoryy.name") , org.hibernate.criterion.Order.asc("displayName") , org.hibernate.criterion.Order.desc("packaging") , org.hibernate.criterion.Order.asc("grossPrice") });
}