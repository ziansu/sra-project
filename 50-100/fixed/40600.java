public void listsProjectsEmptyFilter() {
    management.limbr.data.model.Project mockProject = mock(management.limbr.data.model.Project.class);
    when(repository.findAll()).thenReturn(java.util.Collections.singletonList(mockProject));
    com.vaadin.data.util.BeanItemContainer<management.limbr.data.model.Project> result = presenter.listEntities("");
    org.testng.Assert.assertEquals(result.size(), 1);
    org.testng.Assert.assertEquals(result.getIdByIndex(0), mockProject);
}