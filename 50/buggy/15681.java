private final org.adempiere.ad.modelvalidator.AnnotatedModelInterceptor.PointcutKey mkKey(org.adempiere.ad.modelvalidator.Pointcut pointcut) {
    return mkKey(pointcut.getTableName(), pointcut.getType());
}