private final org.adempiere.ad.modelvalidator.AnnotatedModelInterceptor.PointcutKey mkKey(@lombok.NonNull
final org.adempiere.ad.modelvalidator.Pointcut pointcut) {
    return mkKey(pointcut.getTableName(), pointcut.getType());
}