public static java.lang.Boolean anonymousReporter(gov.ca.cwds.rest.api.domain.ScreeningToReferral str) throws gov.ca.cwds.rest.services.ServiceException {
    java.util.Set<gov.ca.cwds.rest.api.domain.Participant> participants;
    participants = str.getParticipants();
    if (participants != null) {
        for (gov.ca.cwds.rest.api.domain.Participant incomingParticipant : participants) {
            java.util.Set<java.lang.String> roles = new java.util.HashSet(incomingParticipant.getRoles());
            if ((roles != null) && (roles.contains(gov.ca.cwds.rest.validation.ParticipantValidator.ANONYMOUS_REPORTER_ROLE))) {
                return true;
            }
        }
    }
    return false;
}