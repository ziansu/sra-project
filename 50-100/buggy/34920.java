@org.junit.Test
public void whenSavingAProjectWithOrderNumberZeroAndTheProjectsRetrievedHasAnItemThenOrderShouldBeAfterThatObject() {
    org.mockito.Mockito.when(projectPaginatedScanList.stream()).thenReturn(java.util.stream.Stream.of(getProject("projectFirst", 1)));
    java.lang.String projectId = "newProject";
    projectsRepository.save(getProject(projectId, 0));
    org.mockito.Mockito.verify(dynamoDBMapper).save(getProject(projectId, 2));
}