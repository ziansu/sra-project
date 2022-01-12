@org.junit.Test
public void whenSavingAProjectWithOrderNumber5AndTheProjectsRetrievedIsEmptyThenJustAddAsFirstInOrder() {
    org.mockito.Mockito.when(projectPaginatedScanList.stream()).thenReturn(java.util.stream.Stream.empty());
    java.lang.String projectId = "newProject";
    projectsRepository.save(getProject(projectId, 5));
    org.mockito.Mockito.verify(dynamoDBMapper).save(getProject(projectId, 1));
}