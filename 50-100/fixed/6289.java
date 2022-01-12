@org.junit.Test
public void whenSavingAProjectWithOrderNumberBeyondLastAndTheProjectsRetrievedHasAnItemThenOrderShouldBeAfterThatObject() {
    when(projectPaginatedScanList.stream()).thenReturn(java.util.stream.Stream.of(getProject("projectFirst", 1)));
    java.lang.String projectId = "newProject";
    projectsRepository.save(getProject(projectId, 15));
    verify(dynamoDBMapper).save(getProject(projectId, 2));
}