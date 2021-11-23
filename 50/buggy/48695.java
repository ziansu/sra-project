@org.junit.Test
public void testAddProject() {
    mockedProjectService.addProject(de.pentasys.SilverPen.service.test.ProjectServiceTest.project1);
    org.mockito.Mockito.verify(de.pentasys.SilverPen.service.test.ProjectServiceTest.em, org.mockito.Mockito.times(1)).persist(de.pentasys.SilverPen.service.test.ProjectServiceTest.project1);
}