public elasta.orm.query.expression.builder.FieldExpressionResolverImpl addKey(elasta.orm.query.expression.FieldExpression fieldExpression) {
    funcMap.put(fieldExpression, new elasta.orm.query.expression.builder.FieldExpressionResolverImpl.NoOpsFieldExpressionHolderFuncImpl());
    return this;
}