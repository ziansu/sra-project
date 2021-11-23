@org.junit.Test
public void canDeactivateForAdmin() throws java.lang.Exception {
    org.mockito.Mockito.doReturn(mockSession).when(controller).getAuthenticatedSession(org.sagebionetworks.bridge.Roles.ADMIN);
    controller.deleteStudy(study.getIdentifier(), "false");
    org.mockito.Mockito.verify(mockStudyService).deactivateStudy(study.getIdentifier());
    verifyNoMoreInteractions(mockStudyService);
}