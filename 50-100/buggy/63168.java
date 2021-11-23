@org.junit.Test
public void canDeleteForAdmin() throws java.lang.Exception {
    org.mockito.Mockito.doReturn(mockSession).when(controller).getAuthenticatedSession(org.sagebionetworks.bridge.Roles.ADMIN);
    controller.deleteStudy(study.getIdentifier(), "true");
    org.mockito.Mockito.verify(mockStudyService).deleteStudy(study.getIdentifier());
    verifyNoMoreInteractions(mockStudyService);
}