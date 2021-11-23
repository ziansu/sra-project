public void updateSessionResponseRateForDeletedStudentResponse(java.lang.String email, java.lang.String sessionName, java.lang.String courseId) throws teammates.common.exception.EntityDoesNotExistException, teammates.common.exception.InvalidParametersException {
    if (noRemainingResponsesFromStudent(email, sessionName, courseId)) {
        deleteStudentFromRespondantList(email, sessionName, courseId);
    }
}