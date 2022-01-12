private org.hibernate.Criteria orderedSearchCriteria(org.hibernate.criterion.Order order, int page) {
    if (page < 0)
        throw new java.lang.IllegalArgumentException("Argument page cannot be negative.");
    
    org.hibernate.Criteria criteria = currentSession().createCriteria(ee.rs.model.Establishment.class);
    if (order != null)
        criteria.addOrder(order);
    
    return criteria.setFirstResult(((ee.rs.repository.establishment.HbnEstablishmentRepository.RESULTS_PER_PAGE) * page)).setMaxResults(ee.rs.repository.establishment.HbnEstablishmentRepository.RESULTS_PER_PAGE);
}