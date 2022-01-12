@org.junit.Test
public void test05() throws java.lang.Exception {
    model.project.ProjectsCollector manager = new model.project.ProjectsCollector(util.serialization.GlobalIdentifiabilitySerializer.getInstance());
    manager.addProject(project);
    manager.addProject(new model.project.Project(null, new model.project.ConcreteProjectFactory(), null));
    manager.deleteProject(project.getId());
    org.junit.Assert.assertEquals(2, manager.getProjects().size());
}