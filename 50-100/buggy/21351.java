@java.lang.Override
public java.lang.Object transform(java.lang.Object o) {
    org.openlmis.core.domain.Refrigerator refrigerator = ((org.openlmis.core.domain.Refrigerator) (o));
    org.openlmis.distribution.service.RefrigeratorReading reading = (null == facilityVisitId) ? null : distributionRefrigeratorsService.getByRefrigeratorIdAndSerialNumber(refrigerator.getId(), refrigerator.getSerialNumber(), facilityVisitId);
    return null == reading ? new org.openlmis.distribution.service.RefrigeratorReading(refrigerator) : reading;
}