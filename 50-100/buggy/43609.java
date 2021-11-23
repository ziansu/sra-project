@java.lang.SuppressWarnings(value = "rawtypes")
private org.jooq.Select getSubSelectToCalcAvgTurnAroundTime(org.jooq.DSLContext context) {
    return context.select(org.jooq.impl.DSL.avg(org.jooq.impl.DSL.isnull(Reviews.REVIEWS.ON_SITE_TIME, 0).add(org.jooq.impl.DSL.isnull(Reviews.REVIEWS.TRAVEL_TIME, 0)))).from(Reviews.REVIEWS).where(Reviews.REVIEWS.FK_LOCATION.equal(Location.LOCATION.ID));
}