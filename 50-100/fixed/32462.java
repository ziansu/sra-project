@org.springframework.web.bind.annotation.RequestMapping(value = "/activityLogs/checkForDuplicateParticipant", method = org.springframework.web.bind.annotation.RequestMethod.GET, produces = { org.springframework.http.MediaType.TEXT_PLAIN_VALUE })
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String checkForDuplicateParticipant(@org.springframework.web.bind.annotation.RequestParam
java.lang.Integer id, @org.springframework.web.bind.annotation.RequestParam
java.lang.String firstName, @org.springframework.web.bind.annotation.RequestParam
java.lang.String lastName, @org.springframework.web.bind.annotation.RequestParam
java.lang.String dob, @org.springframework.web.bind.annotation.RequestParam
java.lang.String participantType, @org.springframework.web.bind.annotation.RequestParam
java.lang.Integer entityId) throws java.lang.Exception {
    java.lang.String participantId = surveymanager.checkForDuplicatParticipant(programId, id, firstName, lastName, dob, participantType, entityId);
    return participantId;
}