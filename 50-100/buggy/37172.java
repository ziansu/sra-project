@org.springframework.transaction.annotation.Transactional
public java.util.List getCitations(java.util.List<java.lang.String> PMIDs) {
    return sessionFactory.getCurrentSession().createCriteria(org.utah.edu.semmed.db.domain.RecentCitationsEntity.class).add(org.hibernate.criterion.Restrictions.in("pmid", PMIDs)).add(org.hibernate.criterion.Restrictions.isNotNull("citationjson")).setProjection(org.hibernate.criterion.Projections.property("citationjson")).list();
}