@org.junit.Test
public void testRemoveProject() {
    mockedProjectService.removeProject(de.pentasys.SilverPen.service.test.ProjectServiceTest.project1);
    verify(de.pentasys.SilverPen.service.test.ProjectServiceTest.em, times(1)).remove(de.pentasys.SilverPen.service.test.ProjectServiceTest.project1);
    mockedProjectService.removeProject(de.pentasys.SilverPen.service.test.ProjectServiceTest.project2);
    verify(de.pentasys.SilverPen.service.test.ProjectServiceTest.em, times(1)).remove(de.pentasys.SilverPen.service.test.ProjectServiceTest.em.merge(de.pentasys.SilverPen.service.test.ProjectServiceTest.project2));
}