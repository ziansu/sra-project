private com.breezejs.hib.CriteriaResult createCriterion(org.hibernate.Criteria crit, com.breezejs.query.AndOrPredicate pred) {
    com.breezejs.query.Operator op = pred.getOperator();
    org.hibernate.criterion.Junction j = (op == (com.breezejs.query.Operator.And)) ? org.hibernate.criterion.Restrictions.conjunction() : org.hibernate.criterion.Restrictions.disjunction();
    org.hibernate.Criteria nextCrit = crit;
    for (com.breezejs.query.Predicate subPred : pred.getPredicates()) {
        com.breezejs.hib.CriteriaResult cr = toCriterion(nextCrit, subPred);
        j.add(cr.criterion);
        nextCrit = cr.criteria;
    }
    return new com.breezejs.hib.CriteriaResult(nextCrit, j);
}