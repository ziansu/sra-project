private void updateStudyStatusState(final java.lang.String statusMessage) throws rifGenericLibrary.system.RIFServiceException {
    rifServices.businessConceptLayer.StudyState currentStudyState = studyStateMachine.next();
    studyStateManager.updateStudyStatus(connection, user, studyID, currentStudyState, statusMessage);
}