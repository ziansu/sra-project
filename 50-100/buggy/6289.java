@org.junit.Test
public void whenSavingAProjectWithOrderNumberBeyondLastAndTheProjectsRetrievedHasAnItemThenOrderShouldBeAfterThatObject() {
    org.mockito.Mockito.when(projectPaginatedScanList.stream()).thenReturn(java.util.stream.Stream.of(getProject("projectFirst", 1)));
    java.lang.String projectId = "newProject";
    projectsRepository.save(getProject(projectId, 15));
    org.mockito.Mockito.verify(dynamoDBMapper).save(getProject(projectId, 2));
}