public static org.openmrs.module.OT.web.util.OTScheduleModel generateObservationFormModel(org.openmrs.module.OT.model.MinorOTProcedure schedule) {
    org.openmrs.Encounter encounter = schedule.getEncounter();
    org.openmrs.module.OT.web.util.OTScheduleModel osm = new org.openmrs.module.OT.web.util.OTScheduleModel();
    if ((encounter != null) && ((encounter.getAllObs().size()) != 0)) {
        osm.setOrderId(schedule.getOpdOrderId().getOpdOrderId());
    }
    return osm;
}