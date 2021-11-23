@org.junit.Test
public void testSetProjects() {
    java.util.Set<ua.com.goit.gojava7.kickstarter.domain.Project> projects = new java.util.HashSet<ua.com.goit.gojava7.kickstarter.domain.Project>();
    projects.add(new ua.com.goit.gojava7.kickstarter.domain.Project());
    category.setProjects(projects);
    org.junit.Assert.assertThat(category.getProjects().size(), org.hamcrest.CoreMatchers.is(1));
}