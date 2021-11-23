public elasta.orm.query.expression.builder.FieldExpressionResolverImpl addKey(elasta.orm.query.expression.FieldExpression fieldExpression) {
    if (funcMap.containsKey(fieldExpression)) {
        throw new elasta.orm.query.expression.builder.ex.FieldExpressionResolverException((("Same fieldExpression '" + fieldExpression) + "' more than once is not supported in selections"));
    }
    funcMap.put(fieldExpression, new elasta.orm.query.expression.builder.FieldExpressionResolverImpl.NoOpsFieldExpressionHolderFuncImpl());
    return this;
}