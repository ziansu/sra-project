private com.github.javalbert.sqlbuilder.Predicate buildExistsPredicate(com.github.javalbert.sqlbuilder.dsl.ExistsPredicate dslPredicate) {
    com.github.javalbert.sqlbuilder.dsl.com.github.javalbert.sqlbuilder.Predicate predicate = newPredicate(dslPredicate);
    if ((dslPredicate.getOperator()) == (PredicateOperator.EXISTS)) {
        predicate.exists();
    }else
        if ((dslPredicate.getOperator()) == (PredicateOperator.NOT_EXISTS)) {
            predicate.notExists();
        }
    
    return predicate.subquery(buildSelect(dslPredicate.getSubquery()));
}