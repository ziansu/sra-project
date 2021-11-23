@java.lang.Override
public java.lang.Object transform(java.lang.Object o) {
    org.openlmis.core.domain.Refrigerator refrigerator = ((org.openlmis.core.domain.Refrigerator) (o));
    if (null == facilityVisitId) {
        return new org.openlmis.distribution.service.RefrigeratorReading(refrigerator);
    }
    org.openlmis.distribution.service.RefrigeratorReading reading = distributionRefrigeratorsService.getByRefrigeratorIdAndSerialNumber(refrigerator.getId(), refrigerator.getSerialNumber(), facilityVisitId);
    return null == reading ? new org.openlmis.distribution.service.RefrigeratorReading(refrigerator) : reading;
}