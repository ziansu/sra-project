@java.lang.Override
public java.util.Collection<com.yahoo.elide.core.filter.FilterPredicate> visitOrExpression(com.yahoo.elide.core.filter.expression.OrFilterExpression expression) {
    filterPredicates.addAll(expression.getLeft().accept(this));
    filterPredicates.addAll(expression.getRight().accept(this));
    return filterPredicates;
}