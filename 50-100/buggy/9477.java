@org.junit.Test
public void whenProjectListIsEmptyReturnAnEmptyList() {
    org.mockito.Mockito.when(projectPaginatedScanList.stream()).thenReturn(java.util.stream.Stream.empty());
    java.util.List<com.romcharm.domain.mypage.Project> orderedList = projectsRepository.getProjects();
    org.hamcrest.MatcherAssert.assertThat(orderedList, is(empty()));
}