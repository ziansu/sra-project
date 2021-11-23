private com.breezejs.hib.CriteriaResult createCriterion(org.hibernate.Criteria crit, com.breezejs.query.UnaryPredicate pred) {
    com.breezejs.hib.CriteriaResult cr = toCriterion(crit, pred.getPredicate());
    return new com.breezejs.hib.CriteriaResult(cr.criteria, org.hibernate.criterion.Restrictions.not(cr.criterion));
}