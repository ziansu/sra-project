private static com.mysema.query.types.expr.BooleanExpression isRemovalTimeInInterval(final java.util.Date gtRemovalTime, final java.util.Date ltRemovalTime) {
    com.mysema.query.types.expr.BooleanExpression afterCondition = (gtRemovalTime != null) ? cz.muni.fi.cepv.querydsl.Experiment2NodeQueryDsl.experiment2Node.removalTime.after(gtRemovalTime) : null;
    com.mysema.query.types.expr.BooleanExpression beforeCondition = (ltRemovalTime != null) ? cz.muni.fi.cepv.querydsl.Experiment2NodeQueryDsl.experiment2Node.removalTime.before(ltRemovalTime) : null;
    return afterCondition != null ? afterCondition.and(beforeCondition) : beforeCondition;
}