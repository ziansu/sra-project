@org.springframework.transaction.annotation.Transactional
public java.util.List getCitations(java.util.List<java.lang.String> PMIDs) {
    if ((PMIDs.size()) > 0) {
        return sessionFactory.getCurrentSession().createCriteria(org.utah.edu.semmed.db.domain.RecentCitationsEntity.class).add(org.hibernate.criterion.Restrictions.in("pmid", PMIDs)).add(org.hibernate.criterion.Restrictions.isNotNull("citationjson")).setProjection(org.hibernate.criterion.Projections.property("citationjson")).list();
    }else
        return new java.util.ArrayList<java.lang.String>();
    
}