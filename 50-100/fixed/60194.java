private com.ning.billing.entitlement.alignment.TimedMigration[] getEventsOnRegularMigration(com.ning.billing.catalog.api.Plan plan, com.ning.billing.catalog.api.PlanPhase initialPhase, java.lang.String priceList, org.joda.time.DateTime effectiveDate) {
    com.ning.billing.entitlement.alignment.TimedMigration[] result = new com.ning.billing.entitlement.alignment.TimedMigration[1];
    result[0] = new com.ning.billing.entitlement.alignment.TimedMigration(effectiveDate, com.ning.billing.entitlement.events.EntitlementEvent.EventType.API_USER, com.ning.billing.entitlement.events.user.ApiEventType.MIGRATE_ENTITLEMENT, plan, initialPhase, priceList);
    return result;
}