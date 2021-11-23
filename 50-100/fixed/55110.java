public static com.amalto.core.query.user.Condition eq(com.amalto.core.query.user.TypedExpression expression, java.lang.String constant) {
    com.amalto.core.query.user.UserQueryBuilder.assertNullField(expression);
    if (expression instanceof com.amalto.core.query.user.Field) {
        return com.amalto.core.query.user.UserQueryBuilder.eq(((com.amalto.core.query.user.Field) (expression)), constant);
    }else {
        return new com.amalto.core.query.user.Compare(expression, Predicate.EQUALS, com.amalto.core.query.user.UserQueryBuilder.createConstant(expression, constant));
    }
}