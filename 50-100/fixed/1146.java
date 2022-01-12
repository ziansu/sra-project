@org.motechproject.event.listener.annotations.MotechListener(subjects = { EventSubjects.CREATE_ENTITY })
public void handleRegistration(org.motechproject.event.MotechEvent event) {
    java.util.Map<java.lang.String, java.lang.Object> params = event.getParameters();
    java.lang.String externalUUID = ((java.lang.String) (params.remove(EventParams.EXTERNAL_ID)));
    org.motechproject.dhis2.rest.domain.TrackedEntityInstanceDto trackedEntityInstance = createTrackedEntityInstanceFromParams(params);
    org.motechproject.dhis2.rest.domain.DhisStatusResponse response = dhisWebService.createTrackedEntityInstance(trackedEntityInstance);
    if ("SUCCESS".equals(response.getStatus())) {
        trackedEntityInstanceMapperService.create(externalUUID, response.getReference());
    }
}