@org.junit.Test
public void whenSavingAProjectWithOrderNumberZeroAndTheProjectsRetrievedIsEmptyThenJustAddAsFirstInOrder() {
    when(projectPaginatedScanList.stream()).thenReturn(java.util.stream.Stream.empty());
    java.lang.String projectId = "newProject";
    projectsRepository.save(getProject(projectId, 0));
    verify(dynamoDBMapper).save(getProject(projectId, 1));
}