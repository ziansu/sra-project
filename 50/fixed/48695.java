@org.junit.Test
public void testAddProject() {
    mockedProjectService.addProject(de.pentasys.SilverPen.service.test.ProjectServiceTest.project1);
    verify(de.pentasys.SilverPen.service.test.ProjectServiceTest.em, times(1)).persist(de.pentasys.SilverPen.service.test.ProjectServiceTest.project1);
}