@org.junit.Test
public void whenSavingAProjectWithOrderNumberZeroAndTheProjectsRetrievedIsEmptyThenJustAddAsFirstInOrder() {
    org.mockito.Mockito.when(projectPaginatedScanList.stream()).thenReturn(java.util.stream.Stream.empty());
    java.lang.String projectId = "newProject";
    projectsRepository.save(getProject(projectId, 0));
    org.mockito.Mockito.verify(dynamoDBMapper).save(getProject(projectId, 1));
}