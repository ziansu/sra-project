@java.lang.Override
public boolean matches(java.lang.Object otherEvent) {
    if (otherEvent instanceof org.phenotips.data.permissions.events.PatientRightsUpdatedEvent) {
        org.phenotips.data.permissions.events.PatientRightsUpdatedEvent otherRightsUpdateEvent = ((org.phenotips.data.permissions.events.PatientRightsUpdatedEvent) (otherEvent));
        if (((this.patientId) != null) && (!(org.apache.commons.lang3.StringUtils.equals(otherRightsUpdateEvent.getPatientId(), this.patientId)))) {
            return false;
        }
        return true;
    }
    return false;
}